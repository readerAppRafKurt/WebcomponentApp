##Uml RSS 2.0 Standaard class-diagram

Class-diagram van een rss-feed volgens de officiële standaard.
Meer info op: http://cyber.law.harvard.edu/rss/rss.html

##UML class diagram
![Screenshot](https://www.github.com/readerAppRafKurt/WebcomponentApp/raw/master/UML/images/rss-2.0-standard.jpg)


###RSS 2.0 Standaard voor een channel/rss-feed
 
	Required properties:
 
	 title 				De titel van de channel.  
	 link 				De url naar een online versie van de channel. 
	 description      	Omschrijving van de channel
	 
	Optionele properties:
	 
	 language 			De taal waarin de channel is geschreven
	 copyright			Copyright van de feed 		 
	 managingEditor 	Emailadres - Content  
	 webMaster 			Emailadres - Technische issues  
	 pubDate 			Publicatie moment van de feed on a hourly, daily, weekly... basis
	 lastBuildDate 		De laatste keer dat de inhoud van de channel is veranderd		
	 List<category> 	lijst van categorien waarbij het artikel hoort
	 generator			String indicating the software used to generate feed
	 docs				Url that points to docs
	 cloud				webservice for processes to be notified for changes, updates
	 ttl				number of minutes
	 image				URL van gif, jpeg of png image 
	 rating				The pics rating for the channel
	 textInput			text input box
	 skipHours			Xml element met de uren in om te skippen [0-23]
	 skipDays			Xml element met de dagen in om te skippen [monday-sunday]


###RSS 2.0 Standaard voor een item, artikel

	Alle Elementen zijn optioneel, maar er moet 
	minstens een titel of een description aanwezig zijn.

	 title 				De titel van het nieuwsitem.  
	 link 				De url naar een online versie van het artikel. 
	 description      	De inhoud van het artikel 
	 author 			Email adres van de auteur
	 category 			Lijst van categorieën waartoe het artikel kan behoren 
	 comments 			URL naar een pagina met commentaren op het artikel 
	 enclosure 			Url naar een media-object (image, video, audio) dat bij het artikel hoort  
	 guid 				Unieke identifier voor het artikel, meestal een url. 
	 pubDate 			Publicatie datum van het artikel 
	 source 			de RSS-feed of channel waarbij het artikel hoort
	 
	 