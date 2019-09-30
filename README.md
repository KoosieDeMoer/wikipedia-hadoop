# wikipedia-hadoop
Analysis of entire Wikipedia content with Hadoop

Reads input records from XML format files.

Source data file is [Wikipedia (English) - all pages 20190901](https://dumps.wikimedia.org/enwiki/20190901/enwiki-20190901-pages-meta-current.xml.bz2)

# Interesting results #
## Year most referred to is 2010 ##
![Mentions for recent years](results/mentions_per_year.png?raw=true "Mentions for recent years")

[All years 1000 to 2099](results/MentionsYearCounter.txt?raw=true)

## Largest articles ##
| Title  | Byte Count |
| ------ | ---------- |
| [Opinion polling for the 2018 Italian general election](https://en.wikipedia.org/wiki/Opinion_polling_for_the_2018_Italian_general_election) | 443163 |
| [List of 2010s deaths in rock and roll](https://en.wikipedia.org/wiki/List_of_2010s_deaths_in_rock_and_roll) | 436836 |
| [2016 in aviation](https://en.wikipedia.org/wiki/2016_in_aviation) | 436812 |
| [List of Marvel Cinematic Universe films](https://en.wikipedia.org/wiki/List_of_Marvel_Cinematic_Universe_films) | 433586 |
| [Special Counsel investigation (2017–2019)](https://en.wikipedia.org/wiki/Special_Counsel_investigation_(2017%E2%80%932019)) | 433364 |
| [2017 in American television](https://en.wikipedia.org/wiki/2017_in_American_television) | 432660 |
| [List of exoplanets discovered using the Kepler space telescope](https://en.wikipedia.org/wiki/List_of_exoplanets_discovered_using_the_Kepler_space_telescope) | 432412 |
| [Panama Papers](https://en.wikipedia.org/wiki/Panama_Papers) | 432236 |
| [List of United States Representatives from New York](https://en.wikipedia.org/wiki/List_of_United_States_Representatives_from_New_York) | 432189 |
| [List of film director and actor collaborations](https://en.wikipedia.org/wiki/List_of_film_director_and_actor_collaborations) | 431913 |
| [List of dramatic television series with LGBT characters](https://en.wikipedia.org/wiki/List_of_dramatic_television_series_with_LGBT_characters) | 429567 |
| [1945 Birthday Honours](https://en.wikipedia.org/wiki/1945_Birthday_Honours) | 429464 |
| [Timeline of 1960s counterculture](https://en.wikipedia.org/wiki/Timeline_of_1960s_counterculture) | 428655 |
| [List of United States Senate election results by state](https://en.wikipedia.org/wiki/List_of_United_States_Senate_election_results_by_state) | 428389 |
| [Donald Trump](https://en.wikipedia.org/wiki/Donald_Trump) | 428167 |
| [2018 in American television](https://en.wikipedia.org/wiki/2018_in_American_television) | 428112 |
| [Timeline of historical geopolitical changes](https://en.wikipedia.org/wiki/Timeline_of_historical_geopolitical_changes) | 428090 |
| [2015 in British television](https://en.wikipedia.org/wiki/2015_in_British_television) | 427107 |
| [Statewide opinion polling for the 2016 Republican Party presidential primaries](https://en.wikipedia.org/wiki/Statewide_opinion_polling_for_the_2016_Republican_Party_presidential_primaries) | 427057 |
| [List of school shootings in the United States](https://en.wikipedia.org/wiki/List_of_school_shootings_in_the_United_States) | 425678 |



## Images most referred to ##

| File Name  | Count | Image |
| ------------- | ------------- | ----- |
| [No image.png](https://en.wikipedia.org/wiki/File:No_image.png)  | 5125 |  ![](https://upload.wikimedia.org/wikipedia/commons/6/6d/No_image.png)  |
| [Med 3.png](https://en.wikipedia.org/wiki/File:Med_3.png)  | 3847  | ![](https://upload.wikimedia.org/wikipedia/commons/9/99/Med_3.png)  |
| [Med 1.png](https://en.wikipedia.org/wiki/File:Med_1.png)  | 3276  |  ![](https://upload.wikimedia.org/wikipedia/commons/b/ba/Med_1.png)    |
| [Med 2.png](https://en.wikipedia.org/wiki/File:Med_2.png)  | 2786  |  ![](https://upload.wikimedia.org/wikipedia/commons/2/25/Med_2.png)    |
| [1rightarrow.png](https://en.wikipedia.org/wiki/File:1rightarrow.png)  | 2712  |  ![](https://upload.wikimedia.org/wikipedia/commons/3/3c/1rightarrow.png)    |
| [Crystal Clear app clean.png](https://en.wikipedia.org/wiki/File:Crystal_Clear_app_clean.png)  | 1886  |  ![](https://upload.wikimedia.org/wikipedia/commons/3/34/Crystal_Clear_app_clean.png)    |
| [TransparentPlaceholder.png](https://en.wikipedia.org/wiki/File:TransparentPlaceholder.png)  | 1585  |  ![](https://upload.wikimedia.org/wikipedia/commons/3/3a/TransparentPlaceholder.png)    |
| [Blue Arrow Up Darker.png](https://en.wikipedia.org/wiki/File:Blue_Arrow_Up_Darker.png)  | 1389  |  ![](https://upload.wikimedia.org/wikipedia/commons/d/db/Blue_Arrow_Up_Darker.png)    |
| [Red-dot-5px.png](https://en.wikipedia.org/wiki/File:Red-dot-5px.png)  | 1163  |  ![](https://upload.wikimedia.org/wikipedia/commons/3/31/Red-dot-5px.png)    |
| [Kansas official transportation map legend.png](https://en.wikipedia.org/wiki/File:Kansas_official_transportation_map_legend.png)  | 942  |  ![](https://upload.wikimedia.org/wikipedia/commons/4/44/Kansas_official_transportation_map_legend.png)    |
| [Gorm silver cup.jpg](https://en.wikipedia.org/wiki/File:Gorm_silver_cup.jpg)  | 934  |  ![](https://upload.wikimedia.org/wikipedia/commons/9/9f/Gorm_silver_cup.jpg)    |
| [European-African-Middle Eastern Campaign Medal streamer.png](https://en.wikipedia.org/wiki/File:European-African-Middle_Eastern_Campaign_Medal_streamer.png)  | 858  |  ![](https://upload.wikimedia.org/wikipedia/commons/9/9d/European-African-Middle_Eastern_Campaign_Medal_streamer.png)    |
| [Sub on2.png](https://en.wikipedia.org/wiki/File:Sub_on2.png)  | 855  |  ![](https://upload.wikimedia.org/wikipedia/en/8/8d/Sub_on2.png)    |
| [WellingtonPhoenixColours.png](https://en.wikipedia.org/wiki/File:WellingtonPhoenixColours.png)  | 807  |  ![](https://upload.wikimedia.org/wikipedia/commons/5/5c/WellingtonPhoenixColours.png)    |
| [Livingston-Island-Map-2010-15.png](https://en.wikipedia.org/wiki/File:Livingston-Island-Map-2010-15.png)  | 710  |  ![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Livingston-Island-Map-2010-15.png/799px-Livingston-Island-Map-2010-15.png)    |
| [Livingston-Island-Map-2010.jpg](https://en.wikipedia.org/wiki/File:Livingston-Island-Map-2010.jpg)  | 586  |  ![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Livingston-Island-Map-2010.jpg/800px-Livingston-Island-Map-2010.jpg)    |
| [Example.jpg](https://en.wikipedia.org/wiki/File:Example.jpg)  | 586  |  ![](https://upload.wikimedia.org/wikipedia/en/a/a9/Example.jpg)    |
| [PerthGloryColours.png](https://en.wikipedia.org/wiki/File:PerthGloryColours.png)  | 577  |  ![](https://upload.wikimedia.org/wikipedia/commons/d/da/PerthGloryColours.png)    |
| [NewcastleJetsColours.png](https://en.wikipedia.org/wiki/File:NewcastleJetsColours.png)  | 567  |  ![](https://upload.wikimedia.org/wikipedia/commons/5/52/NewcastleJetsColours.png)    |
| [Crystal Clear action button cancel.png](https://en.wikipedia.org/wiki/File:Crystal_Clear_action_button_cancel.png)  | 563  |  ![](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Crystal_Clear_action_button_cancel.svg/128px-Crystal_Clear_action_button_cancel.svg.png)    |

# Usage notes #
Make a runnable jar file with the class MentionsYearDriver indicated as containing the main method.
Run the jar in hadoop with command:

    hadoop jar <jarFileName>
    

