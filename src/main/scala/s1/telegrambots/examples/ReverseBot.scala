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

  val namedays = Map(

"01-01" -> List(

),

"01-02" -> List(
"Aapeli"
),

"01-03" -> List(
"Elmeri","Elmo","Elmer"
),

"01-04" -> List(
"Ruut"
),

"01-05" -> List(
"Lea","Leea"
),

"01-06" -> List(
"Harri"
),

"01-07" -> List(
"Aukusti","Aku","August"
),

"01-08" -> List(
"Hilppa","Titta"
),

"01-09" -> List(
"Veijo","Veikko","Veli"
),

"01-10" -> List(
"Nyyrikki"
),

"01-11" -> List(
"Kari","Karri"
),

"01-12" -> List(
"Toini"
),

"01-13" -> List(
"Nuutti"
),

"01-14" -> List(
"Sakari","Saku"
),

"01-15" -> List(
"Solja"
),

"01-16" -> List(
"Ilmari","Ilmo"
),

"01-17" -> List(
"Anton","Antto","Anttoni","Toni"
),

"01-18" -> List(
"Laura"
),

"01-19" -> List(
"Heikki","Henri","Henrik","Henrikki"
),

"01-20" -> List(
"Henna","Henni","Henriikka"
),

"01-21" -> List(
"Aune","Auni","Oona"
),

"01-22" -> List(
"Visa"
),

"01-23" -> List(
"Eine","Eini","Enni"
),

"01-24" -> List(
"Senja"
),

"01-25" -> List(
"Paavali","Paavo","Paul","Pauli"
),

"01-26" -> List(
"Joonatan"
),

"01-27" -> List(
"Viljo"
),

"01-28" -> List(
"Kaarle","Kaarlo","Kalle","Mies"
),

"01-29" -> List(
"Valtteri"
),

"01-30" -> List(
"Irja"
),

"01-31" -> List(
"Alli"
),

"02-01" -> List(
"Riitta"
),

"02-02" -> List(
"Aamu","Jemina","Lumi"
),

"02-03" -> List(
"Valo"
),

"02-04" -> List(
"Armi","Ronja"
),

"02-05" -> List(
"Asser"
),

"02-06" -> List(
"Tea","Teija","Terhikki","Tiia","Terhi"
),

"02-07" -> List(
"Rikhard","Riku"
),

"02-08" -> List(
"Laina"
),

"02-09" -> List(
"Raija","Raisa"
),

"02-10" -> List(
"Elina","Ella","Ellen","Elna"
),

"02-11" -> List(
"Talvikki"
),

"02-12" -> List(
"Elma","Elmi"
),

"02-13" -> List(
"Sulho","Sulo"
),

"02-14" -> List(
"Tino","Valentin","Voitto"
),

"02-15" -> List(
"Sipi","Sippo"
),

"02-16" -> List(
"Kai"
),

"02-17" -> List(
"Karita","Rita","VÃ¤inÃ¤m","VÃ¤inÃ¶"
),

"02-18" -> List(
"Kaino"
),

"02-19" -> List(
"Eija"
),

"02-20" -> List(
"HeljÃ¤","Hely","Heli","HelinÃ¤"
),

"02-21" -> List(
"Keijo"
),

"02-22" -> List(
"Hilda","Tuuli","Tuulia","Tuulikki"
),

"02-23" -> List(
"Aslak"
),

"02-24" -> List(
"Matias","Matti"
),

"02-25" -> List(
"Tuija","Tuire"
),

"02-26" -> List(
"Nestori"
),

"02-27" -> List(
"Torsti"
),

"02-28" -> List(
"Onni"
),

"03-01" -> List(
"Alpo","Alvi","Alpi"
),

"03-02" -> List(
"Virve","Fanni","Virva"
),

"03-03" -> List(
"Kauko"
),

"03-04" -> List(
"Ari","Atro","Arsi"
),

"03-05" -> List(
"Laila","Leila"
),

"03-06" -> List(
"Tarmo"
),

"03-07" -> List(
"Tarja","Taru"
),

"03-08" -> List(
"Vilppu"
),

"03-09" -> List(
"Auvo"
),

"03-10" -> List(
"Aurora","Aura","Auri"
),

"03-11" -> List(
"Kalervo"
),

"03-12" -> List(
"Reijo","Reko"
),

"03-13" -> List(
"Tarvo","Ernesti","Erno"
),

"03-14" -> List(
"Matilda","Tilda","Mette"
),

"03-15" -> List(
"Risto"
),

"03-16" -> List(
"Ilkka"
),

"03-17" -> List(
"Kerttu","Kerttuli"
),

"03-18" -> List(
"Edvard","Eetu"
),

"03-19" -> List(
"Joosef","Jooseppi","Josefiina","Juuso"
),

"03-20" -> List(
"Aki","Jaakkima","Joakim","Kim"
),

"03-21" -> List(
"Pentti"
),

"03-22" -> List(
"Vihtori"
),

"03-23" -> List(
"Akseli"
),

"03-24" -> List(
"Gabriel","Kaappo","Kaapro","Kaapo"
),

"03-25" -> List(
"Aija"
),

"03-26" -> List(
"Immanuel","Immo","Manne","Manu"
),

"03-27" -> List(
"Saul","Sauli"
),

"03-28" -> List(
"Armas"
),

"03-29" -> List(
"Joonas","Jouni","Joni","Jonni","Jonne"
),

"03-30" -> List(
"Usko"
),

"03-31" -> List(
"Irma","Irmeli"
),

"04-01" -> List(
"Pulmu","Raita"
),

"04-02" -> List(
"Pellervo"
),

"04-03" -> List(
"Sampo"
),

"04-04" -> List(
"Ukko"
),

"04-05" -> List(
"Ira","Irene","Irina","Iro"
),

"04-06" -> List(
"Vilho","Vilhelm","Jami","Vili","Ville","Viljami"
),

"04-07" -> List(
"Ahvo","Allan"
),

"04-08" -> List(
"Suoma","Suometar"
),

"04-09" -> List(
"Eelis","Elias","Eljas"
),

"04-10" -> List(
"Tero"
),

"04-11" -> List(
"Verna","Minea"
),

"04-12" -> List(
"Julia","Juliaana","Julius"
),

"04-13" -> List(
"Tellervo"
),

"04-14" -> List(
"Taito"
),

"04-15" -> List(
"Lina","Tuomi"
),

"04-16" -> List(
"Jalo","Patrik"
),

"04-17" -> List(
"Otto"
),

"04-18" -> List(
"Valdemar","Valto"
),

"04-19" -> List(
"PÃ¤lvi","Pilvi"
),

"04-20" -> List(
"Lauha","Nella"
),

"04-21" -> List(
"Anselmi","Anssi"
),

"04-22" -> List(
"Alina"
),

"04-23" -> List(
"Jori","Jyri","YrjÃ¤nÃ¤","Jyrki","YrjÃ¤"
),

"04-24" -> List(
"Albert","Altti","Pertti"
),

"04-25" -> List(
"Markku","Marko","Markus"
),

"04-26" -> List(
"Teresa","Terttu"
),

"04-27" -> List(
"Merja"
),

"04-28" -> List(
"Ilpo","Ilppo","Tuure"
),

"04-29" -> List(
"Teijo"
),

"04-30" -> List(
"Miia","Mira","Mirja","Mirjami","Mirka","Mirkka","Mirva"
),

"05-01" -> List(
"Valpuri","Vappu"
),

"05-02" -> List(
"Viivi","Vuokko"
),

"05-03" -> List(
"Outi"
),

"05-04" -> List(
"Roosa","Ruusu"
),

"05-05" -> List(
"Maini","Melina"
),

"05-06" -> List(
"Ylermi"
),

"05-07" -> List(
"Helmi","Kastehelmi"
),

"05-08" -> List(
"Heino"
),

"05-09" -> List(
"Timo"
),

"05-10" -> List(
"Aina","Ainikki","Aino"
),

"05-11" -> List(
"Osmo"
),

"05-12" -> List(
"Liotta"
),

"05-13" -> List(
"Floora","Kukka"
),

"05-14" -> List(
"Tuula"
),

"05-15" -> List(
"Sinja","Sofia","Sohvi"
),

"05-16" -> List(
"Ester","Esteri","Essi"
),

"05-17" -> List(
"Maili","Maisa","Rebekka","Mailis","Maila"
),

"05-18" -> List(
"Eero","Erkki","Eerika","Eerikki"
),

"05-19" -> List(
"Amalia","Emilia","Emmi","Milja","Emma","Milka","Milla","Mila"
),

"05-20" -> List(
"Lilli","Karoliina","Lilja"
),

"05-21" -> List(
"Konsta","Konstantin","Kosti"
),

"05-22" -> List(
"Hemmikki","Hemmo"
),

"05-23" -> List(
"Lyydia","Lyyli"
),

"05-24" -> List(
"Tuoko","Tuukka"
),

"05-25" -> List(
"Urpo"
),

"05-26" -> List(
"Miina","Mimmi","Vilma","Minna","Vilhelmiina"
),

"05-27" -> List(
"Ritva"
),

"05-28" -> List(
"Alma"
),

"05-29" -> List(
"Oiva","Oivi","Olivia"
),

"05-30" -> List(
"Pasi"
),

"05-31" -> List(
"Helga","Helka"
),

"06-01" -> List(
"Nikodemus","Teemu"
),

"06-02" -> List(
"Venla"
),

"06-03" -> List(
"Orvokki","Viola"
),

"06-04" -> List(
"Toivo"
),

"06-05" -> List(
"Sulevi"
),

"06-06" -> List(
"Kustaa","Kustavi","KyÃ¤sti"
),

"06-07" -> List(
"Robert","Roope","Suvi"
),

"06-08" -> List(
"Salomo","Salomon"
),

"06-09" -> List(
"Ensio"
),

"06-10" -> List(
"Seppo"
),

"06-11" -> List(
"Immi","Impi"
),

"06-12" -> List(
"Esko"
),

"06-13" -> List(
"Raila","Raili"
),

"06-14" -> List(
"Kielo"
),

"06-15" -> List(
"Viena","Vieno"
),

"06-16" -> List(
"PÃ¤ivÃ¤","PÃ¤ivi","PÃ¤ivikki"
),

"06-17" -> List(
"Urho"
),

"06-18" -> List(
"Tapio"
),

"06-19" -> List(
"Siiri"
),

"06-20" -> List(
"Into"
),

"06-21" -> List(
"Ahti","Ahto"
),

"06-22" -> List(
"PaulaLiina","Pauliina"
),

"06-23" -> List(
"Aadolf","Aatto","Aatu"
),

"06-24" -> List(
"Jussi","Juha","Juhani","Jukka","Johannes","Juhana","Jani","Janne","Juho"
),

"06-25" -> List(
"Uuno"
),

"06-26" -> List(
"Jorm","Jere","Jarno","Jarmo","Jeremias","Jarkko"
),

"06-27" -> List(
"Elvi","Elviira"
),

"06-28" -> List(
"Leo"
),

"06-29" -> List(
"Pekka","Petri","Pekko","Pietari","Petra","Petteri"
),

"06-30" -> List(
"PÃ¤ivÃ¶","PÃ¤iviÃ¶"
),

"07-01" -> List(
"Aaro","Aaron"
),

"07-02" -> List(
"Meeri","Maaria","Maija","Maiju","Maikki","Mari","Kukka-Maaria","Marika","Maria"
),

"07-03" -> List(
"Arvo"
),

"07-04" -> List(
"Ulla","Ulpu"
),

"07-05" -> List(
"Untamo","Unto"
),

"07-06" -> List(
"Esa","Esaias"
),

"07-07" -> List(
"Klaus","Launo"
),

"07-08" -> List(
"Turkka","Turo"
),

"07-09" -> List(
"Ilta","Jade","Jasmin"
),

"07-10" -> List(
"Saima","Saimi"
),

"07-11" -> List(
"Eleonoora","Elli","Nelli","Noora"
),

"07-12" -> List(
"Herman","Hermanni","Herkko"
),

"07-13" -> List(
"Ilari","Joel","Lari"
),

"07-14" -> List(
"Aliisa"
),

"07-15" -> List(
"Rauna","Rauni"
),

"07-16" -> List(
"Reino"
),

"07-17" -> List(
"Ossi","Ossian"
),

"07-18" -> List(
"Riikka"
),

"07-19" -> List(
"Salla","Salli","Sara","Sari","Saara"
),

"07-20" -> List(
"Maarit","Maaret","Margareeta","Reeta","Marketta","Reetta"
),

"07-21" -> List(
"Jonna","Jenni","Jenna","Hanne","Hannele","Johanna","Hanna","Joanna"
),

"07-22" -> List(
"Leena","Leeni","Lenita","Matleena"
),

"07-23" -> List(
"Oili","Olga"
),

"07-24" -> List(
"Kiia","Kirsi","Tiina","Kirsti","Kristiina"
),

"07-25" -> List(
"Jaakko","Jaakob","Jaakoppi"
),

"07-26" -> List(
"Martta"
),

"07-27" -> List(
"Heidi"
),

"07-28" -> List(
"Atso"
),

"07-29" -> List(
"Olavi","Olli","Uolevi","Uoti"
),

"07-30" -> List(
"Asta"
),

"07-31" -> List(
"Elena","Helena"
),

"08-01" -> List(
"Maire"
),

"08-02" -> List(
"Kimmo"
),

"08-03" -> List(
"Linnea","Nea","Vanamo"
),

"08-04" -> List(
"Veera"
),

"08-05" -> List(
"Salme","Sanelma"
),

"08-06" -> List(
"Keimo","Toimi"
),

"08-07" -> List(
"Lahja"
),

"08-08" -> List(
"Silva","Sylvi","Sylvia"
),

"08-09" -> List(
"Eira","Erja"
),

"08-10" -> List(
"Lauri","Lasse","Lassi"
),

"08-11" -> List(
"Sanna","Sanni","Susanna","Susanne"
),

"08-12" -> List(
"Klaara"
),

"08-13" -> List(
"Jesse"
),

"08-14" -> List(
"Kanerva","Onerva"
),

"08-15" -> List(
"Marja","Jaana","Marjatta","Marjo","Marita","Marjut","Marianne","Maritta","Marjaana","Marjukka","Marianna","Jatta"
),

"08-16" -> List(
"Aulis"
),

"08-17" -> List(
"Verneri"
),

"08-18" -> List(
"Leevi"
),

"08-19" -> List(
"Mauno","Maunu"
),

"08-20" -> List(
"Sami","Samuli","Samu","Samuel"
),

"08-21" -> List(
"Soini","Veini"
),

"08-22" -> List(
"Iivari","Iivo"
),

"08-23" -> List(
"Signe","Varma"
),

"08-24" -> List(
"Perttu"
),

"08-25" -> List(
"Loviisa"
),

"08-26" -> List(
"Ilma","Ilmatar","Ilmi"
),

"08-27" -> List(
"Rauli"
),

"08-28" -> List(
"Tauno"
),

"08-29" -> List(
"Iina","Iinari","Iines"
),

"08-30" -> List(
"Eemeli","Eemil"
),

"08-31" -> List(
"Arvi"
),

"09-01" -> List(
"Pirkka"
),

"09-02" -> List(
"Sini","Sinikka"
),

"09-03" -> List(
"Soili","Soila","Soile"
),

"09-04" -> List(
"Ansa"
),

"09-05" -> List(
"Mainio","Roni"
),

"09-06" -> List(
"Asko"
),

"09-07" -> List(
"Miro","Arhippa","Arho"
),

"09-08" -> List(
"Taimi"
),

"09-09" -> List(
"Eevert","Isto"
),

"09-10" -> List(
"Kaleva","Kalevi"
),

"09-11" -> List(
"Ale","Aleksanteri","Ali","Aleksandra"
),

"09-12" -> List(
"Valma","Vilja"
),

"09-13" -> List(
"Orvo"
),

"09-14" -> List(
"Iida"
),

"09-15" -> List(
"Sirpa"
),

"09-16" -> List(
"Hilla","Hille","Hellevi","Hillevi"
),

"09-17" -> List(
"Aila","Aili"
),

"09-18" -> List(
"Tytti","Tyyne","Tyyni"
),

"09-19" -> List(
"Reija"
),

"09-20" -> List(
"Varpu","Vaula"
),

"09-21" -> List(
"Mervi"
),

"09-22" -> List(
"Mauri"
),

"09-23" -> List(
"Mielikki","Minja","Miisa"
),

"09-24" -> List(
"Alvar","Auno"
),

"09-25" -> List(
"Kullervo"
),

"09-26" -> List(
"Kuisma"
),

"09-27" -> List(
"Vesa"
),

"09-28" -> List(
"Arja"
),

"09-29" -> List(
"Miika","Mikaela","Mikael","Miikka","Miska","Mikko"
),

"09-30" -> List(
"Sirja","Sorja"
),

"10-01" -> List(
"Raino","Raine","Rainer","Rauno"
),

"10-02" -> List(
"Valio"
),

"10-03" -> List(
"Raimo"
),

"10-04" -> List(
"Saija","Saila"
),

"10-05" -> List(
"Inka","Inkeri"
),

"10-06" -> List(
"Minttu","Pinja"
),

"10-07" -> List(
"Birgitta","Pirita","Piritta","Pirjo","Pirkko"
),

"10-08" -> List(
"Hilja"
),

"10-09" -> List(
"Ilona"
),

"10-10" -> List(
"Aleksi","Aleksis"
),

"10-11" -> List(
"Ohto","Otso"
),

"10-12" -> List(
"Aarre","Aarto"
),

"10-13" -> List(
"Taija","Taina","Tanja"
),

"10-14" -> List(
"Elsa","Else","Elsi"
),

"10-15" -> List(
"Helvi","Heta"
),

"10-16" -> List(
"Sirkka","Sirkku"
),

"10-17" -> List(
"Saana","Saini"
),

"10-18" -> List(
"SÃ¤de","Satu"
),

"10-19" -> List(
"Uljas"
),

"10-20" -> List(
"Kasperi","Kauno"
),

"10-21" -> List(
"Ursula"
),

"10-22" -> List(
"Anniina","Anette","Anitta","Anita","Anja"
),

"10-23" -> List(
"Severi"
),

"10-24" -> List(
"Asmo","Rasmus"
),

"10-25" -> List(
"Sointu"
),

"10-26" -> List(
"Amanda","Manta","Niina"
),

"10-27" -> List(
"Hellin","HellÃ¤","Helli","Helle"
),

"10-28" -> List(
"Simo"
),

"10-29" -> List(
"Alfred","Urmas"
),

"10-30" -> List(
"Eila"
),

"10-31" -> List(
"Arto","Arttu","Artturi"
),

"11-01" -> List(
"Lyly","Pyry"
),

"11-02" -> List(
"Topi","Topias"
),

"11-03" -> List(
"Terho"
),

"11-04" -> List(
"Hertta"
),

"11-05" -> List(
"Reima"
),

"11-06" -> List(

),

"11-07" -> List(
"Taisto"
),

"11-08" -> List(
"Aatos"
),

"11-09" -> List(
"Teuvo"
),

"11-10" -> List(
"Martti"
),

"11-11" -> List(
"Panu"
),

"11-12" -> List(
"Virpi"
),

"11-13" -> List(
"Ano","Kristian"
),

"11-14" -> List(
"Iiris"
),

"11-15" -> List(
"Janette","Janita","Janika","Janina"
),

"11-16" -> List(
"Aarne","Aarni","Aarno"
),

"11-17" -> List(
"Einari","Eino"
),

"11-18" -> List(
"Jousia","Tenho"
),

"11-19" -> List(
"Eliisa","Elisa","Elise","Elisabet","Liisi","Liisa"
),

"11-20" -> List(
"Jalmari","Jari"
),

"11-21" -> List(
"Hilma"
),

"11-22" -> List(
"Selja","Silja"
),

"11-23" -> List(
"Ismo"
),

"11-24" -> List(
"Sivi","Lemmikki","Lempi"
),

"11-25" -> List(
"Katriina","Kaarina","Kaija","Kaisa","Katariina","Kati","Kaisu","Katja","Katri","Riina"
),

"11-26" -> List(
"Sisko"
),

"11-27" -> List(
"Hilkka"
),

"11-28" -> List(
"Heini","Kaisla"
),

"11-29" -> List(
"Aimo"
),

"11-30" -> List(
"Antero","Antti","Atte"
),

"12-01" -> List(
"Oskari"
),

"12-02" -> List(
"Anelma","Unelma"
),

"12-03" -> List(
"Meri","Vellamo"
),

"12-04" -> List(
"Aira","Airi"
),

"12-05" -> List(
"Selma"
),

"12-06" -> List(
"Niko","Nikolai","Niilo","Niklas"
),

"12-07" -> List(
"Sampsa"
),

"12-08" -> List(
"Kylli","Kyllikki"
),

"12-09" -> List(
"Anna","Anne","Anneli","Anni","Annika","Annikki","Annukka","Anu"
),

"12-10" -> List(
"Jutta"
),

"12-11" -> List(
"Daniel","Taneli","Tatu"
),

"12-12" -> List(
"Tuovi"
),

"12-13" -> List(
"Seija"
),

"12-14" -> List(
"Jouko"
),

"12-15" -> List(
"Heimo"
),

"12-16" -> List(
"Aada","Auli","Aulikki"
),

"12-17" -> List(
"Raakel"
),

"12-18" -> List(
"Aapo","Aappo","Rami"
),

"12-19" -> List(
"Iiro","Iikka","Isko","Iisakki"
),

"12-20" -> List(
"Benjamin","Kerkko"
),

"12-21" -> List(
"Tuomo","Tommi","Tomi","Tuomas"
),

"12-22" -> List(
"Raafael"
),

"12-23" -> List(
"Senni"
),

"12-24" -> List(
"Aatami","Eeva","Eevi","Eveliina"
),

"12-25" -> List(

),

"12-26" -> List(
"Tahvo","Tapani","Teppo"
),

"12-27" -> List(
"Hannes","Hannu"
),

"12-28" -> List(
"Piia"
),

"12-29" -> List(
"Rauha"
),

"12-30" -> List(
"Taavi","Daavid","Taavetti"
),

"12-31" -> List(
"Silvo","Sylvester"
)
)

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
      val kissa = namedays("01-03")
     for (x <- kissa) {
       println(x)
     }
  }


  //synchronized{wait()}
}
