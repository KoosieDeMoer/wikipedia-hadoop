package za.co.ennui.hadoop;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.Counters.Counter;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskAttemptID;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;
import org.apache.hadoop.mapreduce.task.TaskAttemptContextImpl;


public class XmlReaderRunner {

	public static void main(String[] args) {
		XmlInputFormat xmlInputFormat = new XmlInputFormat();
		InputSplit split = new FileSplit(new Path("/inputMapReduce/data.xml"), 0, 200000, null);
		JobConf job_conf = new JobConf(XmlReaderRunner.class);
		
		TaskAttemptID taskId = new TaskAttemptID();
		TaskAttemptContext context = (TaskAttemptContext) new TaskAttemptContextImpl(job_conf, taskId );
		RecordReader<LongWritable, Text> recordReader = xmlInputFormat.createRecordReader(split, context);
		try {
			recordReader.initialize(split, context);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		MentionsMapper mentionsMapper = new MentionsMapper();
		
		try {
			while(recordReader.nextKeyValue()) {
				LongWritable currentKey = recordReader.getCurrentKey();
				Text currentValue = recordReader.getCurrentValue();
				System.out.println("in while loop: " + currentKey + "" + currentValue);
		Object mapContext;
				RecordWriter<Text, NullWritable> recordWriter = new RecordWriter<Text, NullWritable>(){

			@Override
			public void close(TaskAttemptContext var1) throws IOException, InterruptedException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void write(Text var1, NullWritable var2) throws IOException, InterruptedException {
				// TODO Auto-generated method stub
				
			}};
			
				OutputCollector<Text, IntWritable> outputCollector = new OutputCollector<Text, IntWritable>() {
					
					@Override
					public void collect(Text arg0, IntWritable arg1) throws IOException {
						System.out.println("Collecting " + arg0 + " = " + arg1);
						
					}
				};
				
				Reporter outputReporter = new Reporter() {
					
					@Override
					public void progress() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void setStatus(String arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void incrCounter(String arg0, String arg1, long arg2) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void incrCounter(Enum<?> arg0, long arg1) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public float getProgress() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public org.apache.hadoop.mapred.InputSplit getInputSplit() throws UnsupportedOperationException {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Counter getCounter(String arg0, String arg1) {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Counter getCounter(Enum<?> arg0) {
						// TODO Auto-generated method stub
						return null;
					}
				};
				mentionsMapper.map(currentKey, currentValue, outputCollector, outputReporter  );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
