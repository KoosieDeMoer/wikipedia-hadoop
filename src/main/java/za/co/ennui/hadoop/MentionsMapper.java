package za.co.ennui.hadoop;
 
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
 
 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class MentionsMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
 
    private static final Log LOG = LogFactory.getLog(MentionsMapper.class);
	private final static IntWritable one = new IntWritable(1);

	@Override
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> collector, Reporter reporter)
			throws IOException {
        try {
        	 
            InputStream is = new ByteArrayInputStream(value.toString().getBytes());
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(is);
 
            doc.getDocumentElement().normalize();
 
            NodeList nList = doc.getElementsByTagName("page");
 
            for (int temp = 0; temp < nList.getLength(); temp++) {
 
                Node nNode = nList.item(temp);
 
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
                    Element eElement = (Element) nNode;
 
                    Element revision = (Element) eElement.getElementsByTagName("revision").item(0);
                    String text = revision.getElementsByTagName("text").item(0).getTextContent();
 
                    text = text.replaceAll("\\{\\{.*\\}\\}", "");
                    Pattern p = Pattern.compile("[1-2]\\d{3}");
                    Matcher m = p.matcher(text);
                    while(m.find()) {
                    	collector.collect(new Text(m.group()), one);
                   }
                 
                }
            }
        } catch (Exception e) {
        	LOG.error(e.getMessage());
        }
 		
	}
 
}