#Mobile webcomponent voor het Nieuwsblad.be
Voor het bedrijf Twipemobile gaan wij een Android applicatie en zijn bijhorende crossbrowser webcomponent ontwikkelen. De Android applicatie en de webcomponent moeten dezelfde functionaliteiten hebben. De applicatie zal een reader zijn, die artikels van nieuwssites uitleest en deze beschikbaar stelt aan de gebruiker. Deze reader zal de gewenste artikels uitlezen uit rss feeds en deze presenteren aan de gebruiker.

##Projectdefinitie
De mobiele applicaties schieten als paddenstoelen uit de grond. Zo is ook het Nieuwsblad geïnteresseerd in een mobiele elektronische krant. Zij hebben deze opdracht in handen gegeven van Twipe Mobile Solutions N.V. in Heverlee. Wij zullen hen hierbij helpen.

Met deze nieuwe technologische toepassing probeert het Nieuwsblad de bestaande lezers en nieuwe lezers aan zich te binden. De applicatie zal verschillende krantenartikels tonen. De lezer zal net als een papieren krant zijn artikels kunnen lezen en doorbladeren. Maar je kan meer met een elektronische krant. Wat zou je ervan vinden om je eigen krant te maken? In de schoenen te staan van de redacteur? Om zelf te beslissen over de opmaak van je krant? Wel, daar willen wij wat aan doen. 

Twipe Mobile Solutions N.V. heeft ons een aantal duidelijke opdrachten meegegeven. Ze willen een applicatie geschreven voor het Android besturingssysteem. Maar wat dan voor de smartphones en tablets met andere besturingssystemen? Daar gaan we een webcomponent voor maken zodat ook hun eigenaars kunnen genieten van hun krant. 

Onze taken binnen de scope hebben we ingedeeld volgens het MoSCoW principe. De Must haves zijn hoofdzakelijk de vereisten van Twipe Mobile Solutions. De andere functionaliteiten lijken ons interessant en boeiend om uit te werken. Afhankelijk van onze tijdsindeling zullen we deze zoveel mogelijk proberen uit te werken. 


##Scope
- **Must:** uitlezen van XML file van het Nieuwsblad
- **Must:** De reader presenteert de artikels in een optimale vorm (Verschillende templates, op basis van de artikels wordt een passende template gekozen) 
- **Must:** De reader is configureerbaar (themes, fonts, blader effecten, kleur ...) 
	Themes(fonts, kleur, ...)
	Bladereffect en (keuze uit verschillende animaties)
	Verschillende, meerdere  RSS feed(s)
- **Must:** De reader is adaptive aan de verschillende schermresoluties
- **Must:** De reader module en download module kunnen als blackbox makkelijk geïntegreerd worden in andere apps
- **Must:** Aanmaken van een 5-tal verschillende templates.
- **Must:** De reader kan elk soort 2.0 Rss-feed inlezen
- **Must:** De artikels moeten offline leesbaar zijn 
(W) De reader kan nog andere populaire vormen van feeds inlezen en bijhouden (Atom, custom made xml ...)
(M) Zoekfunctie naar artikels op trefwoord in titel en/of artikeltekst
(S) Uitgebreide zoekfunctie met verschillende parameters (feed, datum, auteur, trefwoord ...)
(C) Zoekfunctie met autocomplete
(S) De reader aanpassen adhv de historiek van de gebruiker. vb. gebruiker leest veel sport, dan wordt er een soort van "sport"reader gemaakt en daarnaast de gewone reader. -> content driven
(S) Meerdere users per reader met historiek (feeds, theme, effect, leesgeschiedenis ...)
(S)  Per gebruiker  [min-max] aantal feeds, themes, effecten
(C)  Per gebruiker, per feed  [min- max] bijhouden artikels (tijdsduur, aantal) + instelbaar
(C) Geolocatie gebruiken voor een weerberichtmodule, georeclame, regionieuws

Voor de webcomponent dachten we nog een gebruikers community te maken. Dit lijkt ons een interessante toevoeging
(C)  Inschrijven, uitschrijven,  herinschrijven, password recovery
(C)  Per artikel (commentaren/reacties, social plugin buttons, polls, analyse, ratings, recensies, mail dit artikel
(C)  Polls
(C)  Reclame
(C)  User driven artikels aan de hand van leesgeschiedenis
(C)  Blok => Meest gelezen, hoogste rating, recenste ...

De belangrijkste resticties: 
De Android applicatie moet werken op de nieuwste versie.
De webcomponent en de android applicatie moet zowel werken op smartphones als op tablets.
De webcomponent moet werken met verschillende browsers. 
De webcomponent gebruikt een ander platform, namelijk HTML5 en Javascript. Daardoor is het mogelijk dat niet alle opportuniteiten uitgewerkt kunnen worden.

