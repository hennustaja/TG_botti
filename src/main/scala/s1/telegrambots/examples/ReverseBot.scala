package s1.telegrambots.examples

import s1.telegrambots.BasicBot

/**
  * Ärsyttävä Botti joka kääntää sanat nurinpäin
  *
  * Botti saamaan reagoimaan kanavan tapahtumiin luomalla funktio/metodi joka käsittelee
  * halutuntyyppistä dataa ja joko palauttaa merkkijonon tai tekee jotain muuta saamallaan
  * datalla.
  *
  * Alla on yksinkertainen esimerkki - metodi joka ottaa merkkijonon ja kääntää sen nurin.
  * Luokassa BasicBot on joukko metodeja, joilla voit asettaa botin suorittamaan oman metodisi
  * ja tekemään tiedolla jotain. replyToString rekisteröi bottiin funktion joka saa
  * syötteekseen jokaisen kanavalle kirjoitetun merkkijonon. Se, mitä funktio
  * palauttaa lähetetään kanavalle.
  */
object ReverseBot extends App {

  // lista paivista jenkkimuodossa "kk-pv". Voidaan viel muokata jos halutaan.

  val namedays = Map("01-01" -> "","01-02" -> "Aapeli","01-03" -> Vector("Elmeri","Elmo","Elmer")
  ,
  "01-04" ->
    "Ruut"
  ,
  "01-05" ->
    "Lea,Leea"
  ,
  "01-06" ->
    "Harri"
  ,
  "01-07" ->
    List("Aukusti","Aku","August")
  ,
  "01-08" ->
   List( "Hilppa","Titta")
  ,
  "01-09" ->
    List("Veijo","VeikkoVeli")
  ,
  "01-10" ->
    "Nyyrikki"
  ,
  "01-11" ->
    List("Kari","Karri")
  ,
  "01-12" ->
    "Toini"
  ,
  "01-13" ->
    "Nuutti"
 ,
  "01-14" ->
    List("Sakari",
    "Saku")
  ,
  "01-15" ->
    "Solja"
  ,
  "01-16" ->
    List("Ilmari",
    "Ilmo")
  ,
  "01-17" ->
    List("Anton","Antto","Anttoni","Toni")
  ,
  "01-18" ->
    "Laura"
  ,
  "01-19" ->
    List("Heikki",
    "Henri",
    "Henrik",
    "Henrikki")
  ,
  "01-20" -> List(
    "Henna",
    "Henni",
    "Henriikka")
  ,
  "01-21" -> List(
    "Aune",
    "Auni",
    "Oona")
  ,
  "01-22" ->
    "Visa"
  ,
  "01-23" -> List(
    "Eine",
    "Eini",
    "Enni")
  ,
  "01-24" ->
    "Senja"
  ,
  "01-25" -> List(
    "Paavali",
    "Paavo",
    "Paul",
    "Pauli")
  ,
  "2013-01-26" ->
    "Joonatan"
  ,
  "01-27" ->
    "Viljo"
  ,
  "-01-28" -> List(
    "Kaarle",
    "Kaarlo",
    "Kalle",
    "Mies")
  ,
  "01-29" ->
    "Valtteri"
  ,
  "01-30" ->
    "Irja"
  ,
  "01-31" ->
    "Alli"
  ,
  "02-01" ->
    "Riitta"
  ,
  "02-02" ->List(
    "Aamu",
    "Jemina",
    "Lumi")
  ,
  "02-03" ->
    "Valo"
  ,
  "02-04" -> List(
    "Armi",
    "Ronja")
  ,
  "02-05" ->
    "Asser"
  ,
  "02-06" -> List(
    "Tea",
    "Teija",
    "Terhikki",
    "Tiia",
    "Terhi")
  ,
  "02-07" -> List(
    "Rikhard",
    "Riku")
  ,
  "02-08" ->
    "Laina"
  ,
  "02-09" -> List(
    "Raija",
    "Raisa")
  ,
  "02-10" -> List(
    "Elina",
    "Ella",
    "Ellen",
    "Elna")
  ,
  "02-11" ->
    "Talvikki"
  ,
  "02-12" -> List(
    "Elma",
    "Elmi")
  ,
  "02-13" -> List(
    "Sulho",
    "Sulo"
  ),
  "02-14" -> List(
    "Tino",
    "Valentin",
    "Voitto"
  ),
  "02-15" -> List(
    "Sipi",
    "Sippo"
  ),
  "02-16" ->
    "Kai"
  ,
  "02-17" -> List(
    "Karita",
    "Rita",
    "Väinäm",
    "Väinö")
  ,
  "02-18" ->
    "Kaino"
  ,
  "02-19" ->
    "Eija"
  ,
  "02-20" -> List(
    "Heljä",
    "Hely",
    "Heli",
    "Helinä")
  ,
  "02-21" ->
    "Keijo"
  ,
  "02-22" -> List(
    "Hilda",
    "Tuuli",
    "Tuulia",
    "Tuulikki"
  ),
  "02-23" ->
    "Aslak"
  ,
  "02-24" -> List(
    "Matias",
    "Matti"
  ),
  "02-25" -> List(
    "Tuija",
    "Tuire"
  ),
  "02-26" ->
    "Nestori"
  ,
  "02-27" ->
    "Torsti"
  ,
  "02-28" ->
    "Onni"
  ,
  "03-01" -> List(
    "Alpo",
    "Alvi",
    "Alpi"
  ),
  "03-02" -> List(
    "Virve",
    "Fanni",
    "Virva"
  ),
  "03-03" ->
    "Kauko"
  ,
  "03-04" -> List(
    "Ari",
    "Atro",
    "Arsi"
  ),
  "03-05" -> List(
    "Laila",
    "Leila"
  ),
  "03-06" ->
    "Tarmo"
  ,
  "03-07" -> List(
    "Tarja",
    "Taru"
  ),
  "03-08" ->
    "Vilppu"
  ,
  "03-09" ->
    "Auvo"
  ,
  "03-10" -> List(
    "Aurora",
    "Aura",
    "Auri"
  ),
  "03-11" ->
    "Kalervo"
  ,
  "03-12" -> List(
    "Reijo",
    "Reko"
  ),
  "03-13" -> List(
    "Tarvo",
    "Ernesti",
    "Erno"
  ),
  "03-14" -> List(
    "Matilda",
    "Tilda",
    "Mette"
  ),
  "03-15" ->
    "Risto"
  ,
  "03-16" ->
    "Ilkka"
  ,
  "03-17" -> List(
    "Kerttu",
    "Kerttuli"
  ),
  "03-18" -> List(
    "Edvard",
    "Eetu"
  ),
  "03-19" -> List(
    "Joosef",
    "Jooseppi",
    "Josefiina",
    "Juuso"
  ),
  "03-20" -> List(
    "Aki",
    "Jaakkima",
    "Joakim",
    "Kim"
  ),
  "03-21" ->
    "Pentti"
  ,
  "03-22" ->
    "Vihtori"
  ,
  "03-23" ->
    "Akseli"
  ,
  "03-24" -> List(
    "Gabriel",
    "Kaappo",
    "Kaapro",
    "Kaapo"
  ),
  "03-25" ->
    "Aija"
  ,
  "03-26" -> List(
    "Immanuel",
    "Immo",
    "Manne",
    "Manu"
  ),
  "03-27" -> List(
    "Saul",
    "Sauli"
  ),
  "03-28" ->
    "Armas"
  ,
  "03-29" -> List(
    "Joonas",
    "Jouni",
    "Joni",
    "Jonni",
    "Jonne"
  ),
  "03-30" ->
    "Usko"
  ,
  "03-31" -> List(
    "Irma",
    "Irmeli"
  ),
  "04-01" -> List(
    "Pulmu",
    "Raita"
  ),
  "04-02" ->
    "Pellervo"
  ,
  "04-03" ->
    "Sampo"
  ,
  "04-04" ->
    "Ukko"
  ,
  "04-05" -> List(
    "Ira",
    "Irene",
    "Irina",
    "Iro"
  ),
  "04-06" -> List(
    "Vilho",
    "Vilhelm",
    "Jami",
    "Vili",
    "Ville",
    "Viljami"
  ),
  "04-07" -> List(
    "Ahvo",
    "Allan"
  ),
  "04-08" -> List(
    "Suoma",
    "Suometar"
  ),
  "04-09" -> List(
    "Eelis",
    "Elias",
    "Eljas"
  ),
  "04-10" ->
    "Tero"
  ,
  "04-11" -> List(
    "Verna",
    "Minea"
  ),
  "04-12" -> List(
    "Julia",
    "Juliaana",
    "Julius"
  ),
  "04-13" ->
    "Tellervo"
  ,
  "04-14" ->
    "Taito"
  ,
  "04-15" -> List(
    "Lina",
    "Tuomi"
  ),
  "04-16" -> List(
    "Jalo",
    "Patrik"
  ),
  "04-17" ->
    "Otto"
  ,
  "04-18" -> List(
    "Valdemar",
    "Valto"
  ),
  "04-19" -> List(
    "Pälvi",
    "Pilvi"
  ),
  "04-20" -> List(
    "Lauha",
    "Nella"
  ),
  "04-21" -> List(
    "Anselmi",
    "Anssi"
  ),
  "04-22" ->
    "Alina"
  ,
  "04-23" -> List(
    "Jori",
    "Jyri",
    "Yrjänä",
    "Jyrki",
    "Yrjä"
  ),
  "04-24" -> List(
    "Albert",
    "Altti",
    "Pertti"
  ),
  "04-25" -> List(
    "Markku",
    "Marko",
    "Markus"
  ),
  "04-26" -> List(
    "Teresa",
    "Terttu"
  ),
  "04-27" ->
    "Merja"
  ,
  "04-28" -> List(
    "Ilpo",
    "Ilppo",
    "Tuure"
  ),
  "04-29" ->
    "Teijo"
  ,
  "04-30" -> List(
    "Miia",
    "Mira",
    "Mirja",
    "Mirjami",
    "Mirka",
    "Mirkka",
    "Mirva"
  ),
  "05-01" -> List(
    "Valpuri",
    "Vappu"
  ),
  "05-02" -> List(
    "Viivi",
    "Vuokko"
  ),
  "05-03" ->
    "Outi"
  ,
  "05-04" -> List(
    "Roosa",
    "Ruusu"
  ),
  "05-05" -> List(
    "Maini",
    "Melina"
  ),
  "05-06" ->
    "Ylermi"
  ,
  "05-07" -> List(
    "Helmi",
    "Kastehelmi"
  ),
  "05-08" ->
    "Heino"
  ,
  "05-09" ->
    "Timo"
  ,
  "05-10" -> List(
    "Aina",
    "Ainikki",
    "Aino"
  ),
  "05-11" ->
    "Osmo"
  ,
  "05-12" ->
    "Liotta"
  ,
  "05-13" -> List(
    "Floora",
    "Kukka"
  ),
  "05-14" ->
    "Tuula"
  ,
  "05-15" -> List(
    "Sinja",
    "Sofia",
    "Sohvi")
  ,
  "05-16" -> List(
    "Ester",
    "Esteri",
    "Essi"
  ),
  "05-17" -> List(
    "Maili",
    "Maisa",
    "Rebekka",
    "Mailis",
    "Maila"
  ))/*,
  "2013-05-18": [
    "Eero",
    "Erkki",
    "Eerika",
    "Eerikki"
  ],
  "2013-05-19": [
    "Amalia",
    "Emilia",
    "Emmi",
    "Milja",
    "Emma",
    "Milka",
    "Milla",
    "Mila"
  ],
  "2013-05-20": [
    "Lilli",
    "Karoliina",
    "Lilja"
  ],
  "2013-05-21": [
    "Konsta",
    "Konstantin",
    "Kosti"
  ],
  "2013-05-22": [
    "Hemmikki",
    "Hemmo"
  ],
  "2013-05-23": [
    "Lyydia",
    "Lyyli"
  ],
  "2013-05-24": [
    "Tuoko",
    "Tuukka"
  ],
  "2013-05-25": [
    "Urpo"
  ],
  "2013-05-26": [
    "Miina",
    "Mimmi",
    "Vilma",
    "Minna",
    "Vilhelmiina"
  ],
  "2013-05-27": [
    "Ritva"
  ],
  "2013-05-28": [
    "Alma"
  ],
  "2013-05-29": [
    "Oiva",
    "Oivi",
    "Olivia"
  ],
  "2013-05-30": [
    "Pasi"
  ],
  "2013-05-31": [
    "Helga",
    "Helka"
  ],
  "2013-06-01": [
    "Nikodemus",
    "Teemu"
  ],
  "2013-06-02": [
    "Venla"
  ],
  "2013-06-03": [
    "Orvokki",
    "Viola"
  ],
  "2013-06-04": [
    "Toivo"
  ],
  "2013-06-05": [
    "Sulevi"
  ],
  "2013-06-06": [
    "Kustaa",
    "Kustavi",
    "Kyästi"
  ],
  "2013-06-07": [
    "Robert",
    "Roope",
    "Suvi"
  ],
  "2013-06-08": [
    "Salomo",
    "Salomon"
  ],
  "2013-06-09": [
    "Ensio"
  ],
  "2013-06-10": [
    "Seppo"
  ],
  "2013-06-11": [
    "Immi",
    "Impi"
  ],
  "2013-06-12": [
    "Esko"
  ],
  "2013-06-13": [
    "Raila",
    "Raili"
  ],
  "2013-06-14": [
    "Kielo"
  ],
  "2013-06-15": [
    "Viena",
    "Vieno"
  ],
  "2013-06-16": [
    "Päivä",
    "Päivi",
    "Päivikki"
  ],
  "2013-06-17": [
    "Urho"
  ],
  "2013-06-18": [
    "Tapio"
  ],
  "2013-06-19": [
    "Siiri"
  ],
  "2013-06-20": [
    "Into"
  ],
  "2013-06-21": [
    "Ahti",
    "Ahto"
  ],
  "2013-06-22": [
    "PaulaLiina",
    "Pauliina"
  ],
  "2013-06-23": [
    "Aadolf",
    "Aatto",
    "Aatu"
  ],
  "2013-06-24": [
    "Jussi",
    "Juha",
    "Juhani",
    "Jukka",
    "Johannes",
    "Juhana",
    "Jani",
    "Janne",
    "Juho"
  ],
  "2013-06-25": [
    "Uuno"
  ],
  "2013-06-26": [
    "Jorm",
    "Jere",
    "Jarno",
    "Jarmo",
    "Jeremias",
    "Jarkko"
  ],
  "2013-06-27": [
    "Elvi",
    "Elviira"
  ],
  "2013-06-28": [
    "Leo"
  ],
  "2013-06-29": [
    "Pekka",
    "Petri",
    "Pekko",
    "Pietari",
    "Petra",
    "Petteri"
  ],
  "2013-06-30": [
    "Päivö",
    "Päiviö"
  ],
  "2013-07-01": [
    "Aaro",
    "Aaron"
  ],
  "2013-07-02": [
    "Meeri",
    "Maaria",
    "Maija",
    "Maiju",
    "Maikki",
    "Mari",
    "Kukka-Maaria",
    "Marika",
    "Maria"
  ],
  "2013-07-03": [
    "Arvo"
  ],
  "2013-07-04": [
    "Ulla",
    "Ulpu"
  ],
  "2013-07-05": [
    "Untamo",
    "Unto"
  ],
  "2013-07-06": [
    "Esa",
    "Esaias"
  ],
  "2013-07-07": [
    "Klaus",
    "Launo"
  ],
  "2013-07-08": [
    "Turkka",
    "Turo"
  ],
  "2013-07-09": [
    "Ilta",
    "Jade",
    "Jasmin"
  ],
  "2013-07-10": [
    "Saima",
    "Saimi"
  ],
  "2013-07-11": [
    "Eleonoora",
    "Elli",
    "Nelli",
    "Noora"
  ],
  "2013-07-12": [
    "Herman",
    "Hermanni",
    "Herkko"
  ],
  "2013-07-13": [
    "Ilari",
    "Joel",
    "Lari"
  ],
  "2013-07-14": [
    "Aliisa"
  ],
  "2013-07-15": [
    "Rauna",
    "Rauni"
  ],
  "2013-07-16": [
    "Reino"
  ],
  "2013-07-17": [
    "Ossi",
    "Ossian"
  ],
  "2013-07-18": [
    "Riikka"
  ],
  "2013-07-19": [
    "Salla",
    "Salli",
    "Sara",
    "Sari",
    "Saara"
  ],
  "2013-07-20": [
    "Maarit",
    "Maaret",
    "Margareeta",
    "Reeta",
    "Marketta",
    "Reetta"
  ],
  "2013-07-21": [
    "Jonna",
    "Jenni",
    "Jenna",
    "Hanne",
    "Hannele",
    "Johanna",
    "Hanna",
    "Joanna"
  ],
  "2013-07-22": [
    "Leena",
    "Leeni",
    "Lenita",
    "Matleena"
  ],
  "2013-07-23": [
    "Oili",
    "Olga"
  ],
  "2013-07-24": [
    "Kiia",
    "Kirsi",
    "Tiina",
    "Kirsti",
    "Kristiina"
  ],
  "2013-07-25": [
    "Jaakko",
    "Jaakob",
    "Jaakoppi"
  ],
  "2013-07-26": [
    "Martta"
  ],
  "2013-07-27": [
    "Heidi"
  ],
  "2013-07-28": [
    "Atso"
  ],
  "2013-07-29": [
    "Olavi",
    "Olli",
    "Uolevi",
    "Uoti"
  ],
  "2013-07-30": [
    "Asta"
  ],
  "2013-07-31": [
    "Elena",
    "Helena"
  ],
  "2013-08-01": [
    "Maire"
  ],
  "2013-08-02": [
    "Kimmo"
  ],
  "2013-08-03": [
    "Linnea",
    "Nea",
    "Vanamo"
  ],
  "2013-08-04": [
    "Veera"
  ],
  "2013-08-05": [
    "Salme",
    "Sanelma"
  ],
  "2013-08-06": [
    "Keimo",
    "Toimi"
  ],
  "2013-08-07": [
    "Lahja"
  ],
  "2013-08-08": [
    "Silva",
    "Sylvi",
    "Sylvia"
  ],
  "2013-08-09": [
    "Eira",
    "Erja"
  ],
  "2013-08-10": [
    "Lauri",
    "Lasse",
    "Lassi"
  ],
  "2013-08-11": [
    "Sanna",
    "Sanni",
    "Susanna",
    "Susanne"
  ],
  "2013-08-12": [
    "Klaara"
  ],
  "2013-08-13": [
    "Jesse"
  ],
  "2013-08-14": [
    "Kanerva",
    "Onerva"
  ],
  "2013-08-15": [
    "Marja",
    "Jaana",
    "Marjatta",
    "Marjo",
    "Marita",
    "Marjut",
    "Marianne",
    "Maritta",
    "Marjaana",
    "Marjukka",
    "Marianna",
    "Jatta"
  ],
  "2013-08-16": [
    "Aulis"
  ],
  "2013-08-17": [
    "Verneri"
  ],
  "2013-08-18": [
    "Leevi"
  ],
  "2013-08-19": [
    "Mauno",
    "Maunu"
  ],
  "2013-08-20": [
    "Sami",
    "Samuli",
    "Samu",
    "Samuel"
  ],
  "2013-08-21": [
    "Soini",
    "Veini"
  ],
  "2013-08-22": [
    "Iivari",
    "Iivo"
  ],
  "2013-08-23": [
    "Signe",
    "Varma"
  ],
  "2013-08-24": [
    "Perttu"
  ],
  "2013-08-25": [
    "Loviisa"
  ],
  "2013-08-26": [
    "Ilma",
    "Ilmatar",
    "Ilmi"
  ],
  "2013-08-27": [
    "Rauli"
  ],
  "2013-08-28": [
    "Tauno"
  ],
  "2013-08-29": [
    "Iina",
    "Iinari",
    "Iines"
  ],
  "2013-08-30": [
    "Eemeli",
    "Eemil"
  ],
  "2013-08-31": [
    "Arvi"
  ],
  "2013-09-01": [
    "Pirkka"
  ],
  "2013-09-02": [
    "Sini",
    "Sinikka"
  ],
  "2013-09-03": [
    "Soili",
    "Soila",
    "Soile"
  ],
  "2013-09-04": [
    "Ansa"
  ],
  "2013-09-05": [
    "Mainio",
    "Roni"
  ],
  "2013-09-06": [
    "Asko"
  ],
  "2013-09-07": [
    "Miro",
    "Arhippa",
    "Arho"
  ],
  "2013-09-08": [
    "Taimi"
  ],
  "2013-09-09": [
    "Eevert",
    "Isto"
  ],
  "2013-09-10": [
    "Kaleva",
    "Kalevi"
  ],
  "2013-09-11": [
    "Ale",
    "Aleksanteri",
    "Ali",
    "Aleksandra"
  ],
  "2013-09-12": [
    "Valma",
    "Vilja"
  ],
  "2013-09-13": [
    "Orvo"
  ],
  "2013-09-14": [
    "Iida"
  ],
  "2013-09-15": [
    "Sirpa"
  ],
  "2013-09-16": [
    "Hilla",
    "Hille",
    "Hellevi",
    "Hillevi"
  ],
  "2013-09-17": [
    "Aila",
    "Aili"
  ],
  "2013-09-18": [
    "Tytti",
    "Tyyne",
    "Tyyni"
  ],
  "2013-09-19": [
    "Reija"
  ],
  "2013-09-20": [
    "Varpu",
    "Vaula"
  ],
  "2013-09-21": [
    "Mervi"
  ],
  "2013-09-22": [
    "Mauri"
  ],
  "2013-09-23": [
    "Mielikki",
    "Minja",
    "Miisa"
  ],
  "2013-09-24": [
    "Alvar",
    "Auno"
  ],
  "2013-09-25": [
    "Kullervo"
  ],
  "2013-09-26": [
    "Kuisma"
  ],
  "2013-09-27": [
    "Vesa"
  ],
  "2013-09-28": [
    "Arja"
  ],
  "2013-09-29": [
    "Miika",
    "Mikaela",
    "Mikael",
    "Miikka",
    "Miska",
    "Mikko"
  ],
  "2013-09-30": [
    "Sirja",
    "Sorja"
  ],
  "2013-10-01": [
    "Raino",
    "Raine",
    "Rainer",
    "Rauno"
  ],
  "2013-10-02": [
    "Valio"
  ],
  "2013-10-03": [
    "Raimo"
  ],
  "2013-10-04": [
    "Saija",
    "Saila"
  ],
  "2013-10-05": [
    "Inka",
    "Inkeri"
  ],
  "2013-10-06": [
    "Minttu",
    "Pinja"
  ],
  "2013-10-07": [
    "Birgitta",
    "Pirita",
    "Piritta",
    "Pirjo",
    "Pirkko"
  ],
  "2013-10-08": [
    "Hilja"
  ],
  "2013-10-09": [
    "Ilona"
  ],
  "2013-10-10": [
    "Aleksi",
    "Aleksis"
  ],
  "2013-10-11": [
    "Ohto",
    "Otso"
  ],
  "2013-10-12": [
    "Aarre",
    "Aarto"
  ],
  "2013-10-13": [
    "Taija",
    "Taina",
    "Tanja"
  ],
  "2013-10-14": [
    "Elsa",
    "Else",
    "Elsi"
  ],
  "2013-10-15": [
    "Helvi",
    "Heta"
  ],
  "2013-10-16": [
    "Sirkka",
    "Sirkku"
  ],
  "2013-10-17": [
    "Saana",
    "Saini"
  ],
  "2013-10-18": [
    "Säde",
    "Satu"
  ],
  "2013-10-19": [
    "Uljas"
  ],
  "2013-10-20": [
    "Kasperi",
    "Kauno"
  ],
  "2013-10-21": [
    "Ursula"
  ],
  "2013-10-22": [
    "Anniina",
    "Anette",
    "Anitta",
    "Anita",
    "Anja"
  ],
  "2013-10-23": [
    "Severi"
  ],
  "2013-10-24": [
    "Asmo",
    "Rasmus"
  ],
  "2013-10-25": [
    "Sointu"
  ],
  "2013-10-26": [
    "Amanda",
    "Manta",
    "Niina"
  ],
  "2013-10-27": [
    "Hellin",
    "Hellä",
    "Helli",
    "Helle"
  ],
  "2013-10-28": [
    "Simo"
  ],
  "2013-10-29": [
    "Alfred",
    "Urmas"
  ],
  "2013-10-30": [
    "Eila"
  ],
  "2013-10-31": [
    "Arto",
    "Arttu",
    "Artturi"
  ],
  "2013-11-01": [
    "Lyly",
    "Pyry"
  ],
  "2013-11-02": [
    "Topi",
    "Topias"
  ],
  "2013-11-03": [
    "Terho"
  ],
  "2013-11-04": [
    "Hertta"
  ],
  "2013-11-05": [
    "Reima"
  ],
  "2013-11-06": [
  ],
  "2013-11-07": [
    "Taisto"
  ],
  "2013-11-08": [
    "Aatos"
  ],
  "2013-11-09": [
    "Teuvo"
  ],
  "2013-11-10": [
    "Martti"
  ],
  "2013-11-11": [
    "Panu"
  ],
  "2013-11-12": [
    "Virpi"
  ],
  "2013-11-13": [
    "Ano",
    "Kristian"
  ],
  "2013-11-14": [
    "Iiris"
  ],
  "2013-11-15": [
    "Janette",
    "Janita",
    "Janika",
    "Janina"
  ],
  "2013-11-16": [
    "Aarne",
    "Aarni",
    "Aarno"
  ],
  "2013-11-17": [
    "Einari",
    "Eino"
  ],
  "2013-11-18": [
    "Jousia",
    "Tenho"
  ],
  "2013-11-19": [
    "Eliisa",
    "Elisa",
    "Elise",
    "Elisabet",
    "Liisi",
    "Liisa"
  ],
  "2013-11-20": [
    "Jalmari",
    "Jari"
  ],
  "2013-11-21": [
    "Hilma"
  ],
  "2013-11-22": [
    "Selja",
    "Silja"
  ],
  "2013-11-23": [
    "Ismo"
  ],
  "2013-11-24": [
    "Sivi",
    "Lemmikki",
    "Lempi"
  ],
  "2013-11-25": [
    "Katriina",
    "Kaarina",
    "Kaija",
    "Kaisa",
    "Katariina",
    "Kati",
    "Kaisu",
    "Katja",
    "Katri",
    "Riina"
  ],
  "2013-11-26": [
    "Sisko"
  ],
  "2013-11-27": [
    "Hilkka"
  ],
  "2013-11-28": [
    "Heini",
    "Kaisla"
  ],
  "2013-11-29": [
    "Aimo"
  ],
  "2013-11-30": [
    "Antero",
    "Antti",
    "Atte"
  ],
  "2013-12-01": [
    "Oskari"
  ],
  "2013-12-02": [
    "Anelma",
    "Unelma"
  ],
  "2013-12-03": [
    "Meri",
    "Vellamo"
  ],
  "2013-12-04": [
    "Aira",
    "Airi"
  ],
  "2013-12-05": [
    "Selma"
  ],
  "2013-12-06": [
    "Niko",
    "Nikolai",
    "Niilo",
    "Niklas"
  ],
  "2013-12-07": [
    "Sampsa"
  ],
  "2013-12-08": [
    "Kylli",
    "Kyllikki"
  ],
  "2013-12-09": [
    "Anna",
    "Anne",
    "Anneli",
    "Anni",
    "Annika",
    "Annikki",
    "Annukka",
    "Anu"
  ],
  "2013-12-10": [
    "Jutta"
  ],
  "2013-12-11": [
    "Daniel",
    "Taneli",
    "Tatu"
  ],
  "2013-12-12": [
    "Tuovi"
  ],
  "2013-12-13": [
    "Seija"
  ],
  "2013-12-14": [
    "Jouko"
  ],
  "2013-12-15": [
    "Heimo"
  ],
  "2013-12-16": [
    "Aada",
    "Auli",
    "Aulikki"
  ],
  "2013-12-17": [
    "Raakel"
  ],
  "2013-12-18": [
    "Aapo",
    "Aappo",
    "Rami"
  ],
  "2013-12-19": [
    "Iiro",
    "Iikka",
    "Isko",
    "Iisakki"
  ],
  "2013-12-20": [
    "Benjamin",
    "Kerkko"
  ],
  "2013-12-21": [
    "Tuomo",
    "Tommi",
    "Tomi",
    "Tuomas"
  ],
  "2013-12-22": [
    "Raafael"
  ],
  "2013-12-23": [
    "Senni"
  ],
  "2013-12-24": [
    "Aatami",
    "Eeva",
    "Eevi",
    "Eveliina"
  ],
  "2013-12-25": [
  ],
  "2013-12-26": [
    "Tahvo",
    "Tapani",
    "Teppo"
  ],
  "2013-12-27": [
    "Hannes",
    "Hannu"
  ],
  "2013-12-28": [
    "Piia"
  ],
  "2013-12-29": [
    "Rauha"
  ],
  "2013-12-30": [
    "Taavi",
    "Daavid",
    "Taavetti"
  ],
  "2013-12-31": [
    "Silvo",
    "Sylvester"
  ]*/

  val bot = new BasicBot() {


    /**
      * Kääntää sanan toisin päin
      */
    def nurinpain(s: String) = s.reverse



    /**
      * rekisteröi botille uuden toiminnon joka ajetaan aina kun
      * kanavalle kirjoitetaan jotain.
      */
    this.replyToString(nurinpain)

    // Lopuksi Botti pitää vielä saada käyntiin
    this.run()

    println("Started")
    println(namedays("03-23"))
  }


  //synchronized{wait()}
}
