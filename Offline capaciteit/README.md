#Offline capaciteit
Een van de grote requirements van de applicatie is dat alle artikels offline kunnen gelezen worden. Dit houdt in dat alles client-side moet worden bijgehouden, zowel de webcomponent als de artikels en channels.

##Introductie: The Meaning of "Offline"

De termen web en online liggen zeer kort bij elkaar en zijn voor veel mensen zelfs synoniemen. 
Om het web te gebruiken moeten we immers online zijn, waarom zouden we dan willen spreken over offline web technologieën en wat houdt die term precies in?
We kunnen enerzijds spreken over compleet offline toepassingen, zoals html-files op drages zoals usb, harddisk, CD's, DVD's ... en anderzijds over web applicaties die zowel offline als online beschikbaar zijn.
Deze offline-online web applicaties brengen een extra kost met zich mee, met name vooral complexiteit. Naast de gekende browser-cache kunnen over een aantal andere technieken spreken.
	
###Verouderde manieren om zaken offline bij te houden
	
	1.Cookies
		+uitleg

	2.Plugin Based Storage
		Flash, java, google gears... Vaak worden deze trouwens op entreprise nivveau uit veiligheid geblokkeerd.
	
	3.Browser-specific features
		voorbeelden zoeken + werkt enkel op specifieke vendor, dus ook al niet te gebruiken.
		
###Html5
	
	1.Web Storage
		LocalStorage en SessionStorage, 2 key-value manier
	2.WebSql en indexedDB
		Uitleg + verschillen 
	3.Application cache
		korte inleidende uitleg geven
		
##Activity diagramma Bootstrap opstartprocedure

![Screenshot](https://www.github.com/readerAppRafKurt/WebcomponentApp/raw/master/UML/images/bootstrap-activity-diagram.jpg)