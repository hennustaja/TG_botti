package s1.telegrambots.examples

import s1.telegrambots.BasicBot
import com.github.nscala_time.time.Imports._

object NimipaivaBot extends App {

  val bot = new BasicBot() {

    def nameDay(msg: Message): String = {

      toDate(msg) match {
        case Some(dateString) => {      // Jos ymmärsi komennon...

          val listOfNames: Vector[String] = namedays(dateString)    // Etsii namedays mapista päivämäärää vastaavan arvon

          var names = ""                    // Muodostaa stringin, jossa nimet on erotettu pilkulla toisistaan
          for (name <- listOfNames) {
            names += name + ", "
          }
          names.stripSuffix(", ")           // Poistaa ylimääräisen pilkun ja välilyönnin stringin lopusta
          }

        case None => "Anteeksi, en ymmärtänyt"      // Jos ei ymmärtänyt komentoa
      }

    }

    def toDate(msg: Message): Option[String] = {      // Muuttaa inputin muotoon "kk-pp"
      if (getString(msg) == "tänään") {               // Tällä hetkellä ymmärtää vain komennon: tänään
        Some(MonthDay.now().toString.stripPrefix("--"))
      }
      else None
    }

    this.command("nimipäivä", nameDay)


    val namedays = Map(

"01-01" -> Vector(

),

"01-02" -> Vector(
"Aapeli"
),

"01-03" -> Vector(
"Elmeri","Elmo","Elmer"
),

"01-04" -> Vector(
"Ruut"
),

"01-05" -> Vector(
"Lea","Leea"
),

"01-06" -> Vector(
"Harri"
),

"01-07" -> Vector(
"Aukusti","Aku","August"
),

"01-08" -> Vector(
"Hilppa","Titta"
),

"01-09" -> Vector(
"Veijo","Veikko","Veli"
),

"01-10" -> Vector(
"Nyyrikki"
),

"01-11" -> Vector(
"Kari","Karri"
),

"01-12" -> Vector(
"Toini"
),

"01-13" -> Vector(
"Nuutti"
),

"01-14" -> Vector(
"Sakari","Saku"
),

"01-15" -> Vector(
"Solja"
),

"01-16" -> Vector(
"Ilmari","Ilmo"
),

"01-17" -> Vector(
"Anton","Antto","Anttoni","Toni"
),

"01-18" -> Vector(
"Laura"
),

"01-19" -> Vector(
"Heikki","Henri","Henrik","Henrikki"
),

"01-20" -> Vector(
"Henna","Henni","Henriikka"
),

"01-21" -> Vector(
"Aune","Auni","Oona"
),

"01-22" -> Vector(
"Visa"
),

"01-23" -> Vector(
"Eine","Eini","Enni"
),

"01-24" -> Vector(
"Senja"
),

"01-25" -> Vector(
"Paavali","Paavo","Paul","Pauli"
),

"01-26" -> Vector(
"Joonatan"
),

"01-27" -> Vector(
"Viljo"
),

"01-28" -> Vector(
"Kaarle","Kaarlo","Kalle","Mies"
),

"01-29" -> Vector(
"Valtteri"
),

"01-30" -> Vector(
"Irja"
),

"01-31" -> Vector(
"Alli"
),

"02-01" -> Vector(
"Riitta"
),

"02-02" -> Vector(
"Aamu","Jemina","Lumi"
),

"02-03" -> Vector(
"Valo"
),

"02-04" -> Vector(
"Armi","Ronja"
),

"02-05" -> Vector(
"Asser"
),

"02-06" -> Vector(
"Tea","Teija","Terhikki","Tiia","Terhi"
),

"02-07" -> Vector(
"Rikhard","Riku"
),

"02-08" -> Vector(
"Laina"
),

"02-09" -> Vector(
"Raija","Raisa"
),

"02-10" -> Vector(
"Elina","Ella","Ellen","Elna"
),

"02-11" -> Vector(
"Talvikki"
),

"02-12" -> Vector(
"Elma","Elmi"
),

"02-13" -> Vector(
"Sulho","Sulo"
),

"02-14" -> Vector(
"Tino","Valentin","Voitto"
),

"02-15" -> Vector(
"Sipi","Sippo"
),

"02-16" -> Vector(
"Kai"
),

"02-17" -> Vector(
"Karita","Rita","VÃ¤inÃ¤m","VÃ¤inÃ¶"
),

"02-18" -> Vector(
"Kaino"
),

"02-19" -> Vector(
"Eija"
),

"02-20" -> Vector(
"HeljÃ¤","Hely","Heli","HelinÃ¤"
),

"02-21" -> Vector(
"Keijo"
),

"02-22" -> Vector(
"Hilda","Tuuli","Tuulia","Tuulikki"
),

"02-23" -> Vector(
"Aslak"
),

"02-24" -> Vector(
"Matias","Matti"
),

"02-25" -> Vector(
"Tuija","Tuire"
),

"02-26" -> Vector(
"Nestori"
),

"02-27" -> Vector(
"Torsti"
),

"02-28" -> Vector(
"Onni"
),

"02-29" -> Vector(
),

"03-01" -> Vector(
"Alpo","Alvi","Alpi"
),

"03-02" -> Vector(
"Virve","Fanni","Virva"
),

"03-03" -> Vector(
"Kauko"
),

"03-04" -> Vector(
"Ari","Atro","Arsi"
),

"03-05" -> Vector(
"Laila","Leila"
),

"03-06" -> Vector(
"Tarmo"
),

"03-07" -> Vector(
"Tarja","Taru"
),

"03-08" -> Vector(
"Vilppu"
),

"03-09" -> Vector(
"Auvo"
),

"03-10" -> Vector(
"Aurora","Aura","Auri"
),

"03-11" -> Vector(
"Kalervo"
),

"03-12" -> Vector(
"Reijo","Reko"
),

"03-13" -> Vector(
"Tarvo","Ernesti","Erno"
),

"03-14" -> Vector(
"Matilda","Tilda","Mette"
),

"03-15" -> Vector(
"Risto"
),

"03-16" -> Vector(
"Ilkka"
),

"03-17" -> Vector(
"Kerttu","Kerttuli"
),

"03-18" -> Vector(
"Edvard","Eetu"
),

"03-19" -> Vector(
"Joosef","Jooseppi","Josefiina","Juuso"
),

"03-20" -> Vector(
"Aki","Jaakkima","Joakim","Kim"
),

"03-21" -> Vector(
"Pentti"
),

"03-22" -> Vector(
"Vihtori"
),

"03-23" -> Vector(
"Akseli"
),

"03-24" -> Vector(
"Gabriel","Kaappo","Kaapro","Kaapo"
),

"03-25" -> Vector(
"Aija"
),

"03-26" -> Vector(
"Immanuel","Immo","Manne","Manu"
),

"03-27" -> Vector(
"Saul","Sauli"
),

"03-28" -> Vector(
"Armas"
),

"03-29" -> Vector(
"Joonas","Jouni","Joni","Jonni","Jonne"
),

"03-30" -> Vector(
"Usko"
),

"03-31" -> Vector(
"Irma","Irmeli"
),

"04-01" -> Vector(
"Pulmu","Raita"
),

"04-02" -> Vector(
"Pellervo"
),

"04-03" -> Vector(
"Sampo"
),

"04-04" -> Vector(
"Ukko"
),

"04-05" -> Vector(
"Ira","Irene","Irina","Iro"
),

"04-06" -> Vector(
"Vilho","Vilhelm","Jami","Vili","Ville","Viljami"
),

"04-07" -> Vector(
"Ahvo","Allan"
),

"04-08" -> Vector(
"Suoma","Suometar"
),

"04-09" -> Vector(
"Eelis","Elias","Eljas"
),

"04-10" -> Vector(
"Tero"
),

"04-11" -> Vector(
"Verna","Minea"
),

"04-12" -> Vector(
"Julia","Juliaana","Julius"
),

"04-13" -> Vector(
"Tellervo"
),

"04-14" -> Vector(
"Taito"
),

"04-15" -> Vector(
"Lina","Tuomi"
),

"04-16" -> Vector(
"Jalo","Patrik"
),

"04-17" -> Vector(
"Otto"
),

"04-18" -> Vector(
"Valdemar","Valto"
),

"04-19" -> Vector(
"PÃ¤lvi","Pilvi"
),

"04-20" -> Vector(
"Lauha","Nella"
),

"04-21" -> Vector(
"Anselmi","Anssi"
),

"04-22" -> Vector(
"Alina"
),

"04-23" -> Vector(
"Jori","Jyri","YrjÃ¤nÃ¤","Jyrki","YrjÃ¤"
),

"04-24" -> Vector(
"Albert","Altti","Pertti"
),

"04-25" -> Vector(
"Markku","Marko","Markus"
),

"04-26" -> Vector(
"Teresa","Terttu"
),

"04-27" -> Vector(
"Merja"
),

"04-28" -> Vector(
"Ilpo","Ilppo","Tuure"
),

"04-29" -> Vector(
"Teijo"
),

"04-30" -> Vector(
"Miia","Mira","Mirja","Mirjami","Mirka","Mirkka","Mirva"
),

"05-01" -> Vector(
"Valpuri","Vappu"
),

"05-02" -> Vector(
"Viivi","Vuokko"
),

"05-03" -> Vector(
"Outi"
),

"05-04" -> Vector(
"Roosa","Ruusu"
),

"05-05" -> Vector(
"Maini","Melina"
),

"05-06" -> Vector(
"Ylermi"
),

"05-07" -> Vector(
"Helmi","Kastehelmi"
),

"05-08" -> Vector(
"Heino"
),

"05-09" -> Vector(
"Timo"
),

"05-10" -> Vector(
"Aina","Ainikki","Aino"
),

"05-11" -> Vector(
"Osmo"
),

"05-12" -> Vector(
"Liotta"
),

"05-13" -> Vector(
"Floora","Kukka"
),

"05-14" -> Vector(
"Tuula"
),

"05-15" -> Vector(
"Sinja","Sofia","Sohvi"
),

"05-16" -> Vector(
"Ester","Esteri","Essi"
),

"05-17" -> Vector(
"Maili","Maisa","Rebekka","Mailis","Maila"
),

"05-18" -> Vector(
"Eero","Erkki","Eerika","Eerikki"
),

"05-19" -> Vector(
"Amalia","Emilia","Emmi","Milja","Emma","Milka","Milla","Mila"
),

"05-20" -> Vector(
"Lilli","Karoliina","Lilja"
),

"05-21" -> Vector(
"Konsta","Konstantin","Kosti"
),

"05-22" -> Vector(
"Hemmikki","Hemmo"
),

"05-23" -> Vector(
"Lyydia","Lyyli"
),

"05-24" -> Vector(
"Tuoko","Tuukka"
),

"05-25" -> Vector(
"Urpo"
),

"05-26" -> Vector(
"Miina","Mimmi","Vilma","Minna","Vilhelmiina"
),

"05-27" -> Vector(
"Ritva"
),

"05-28" -> Vector(
"Alma"
),

"05-29" -> Vector(
"Oiva","Oivi","Olivia"
),

"05-30" -> Vector(
"Pasi"
),

"05-31" -> Vector(
"Helga","Helka"
),

"06-01" -> Vector(
"Nikodemus","Teemu"
),

"06-02" -> Vector(
"Venla"
),

"06-03" -> Vector(
"Orvokki","Viola"
),

"06-04" -> Vector(
"Toivo"
),

"06-05" -> Vector(
"Sulevi"
),

"06-06" -> Vector(
"Kustaa","Kustavi","KyÃ¤sti"
),

"06-07" -> Vector(
"Robert","Roope","Suvi"
),

"06-08" -> Vector(
"Salomo","Salomon"
),

"06-09" -> Vector(
"Ensio"
),

"06-10" -> Vector(
"Seppo"
),

"06-11" -> Vector(
"Immi","Impi"
),

"06-12" -> Vector(
"Esko"
),

"06-13" -> Vector(
"Raila","Raili"
),

"06-14" -> Vector(
"Kielo"
),

"06-15" -> Vector(
"Viena","Vieno"
),

"06-16" -> Vector(
"PÃ¤ivÃ¤","PÃ¤ivi","PÃ¤ivikki"
),

"06-17" -> Vector(
"Urho"
),

"06-18" -> Vector(
"Tapio"
),

"06-19" -> Vector(
"Siiri"
),

"06-20" -> Vector(
"Into"
),

"06-21" -> Vector(
"Ahti","Ahto"
),

"06-22" -> Vector(
"PaulaLiina","Pauliina"
),

"06-23" -> Vector(
"Aadolf","Aatto","Aatu"
),

"06-24" -> Vector(
"Jussi","Juha","Juhani","Jukka","Johannes","Juhana","Jani","Janne","Juho"
),

"06-25" -> Vector(
"Uuno"
),

"06-26" -> Vector(
"Jorm","Jere","Jarno","Jarmo","Jeremias","Jarkko"
),

"06-27" -> Vector(
"Elvi","Elviira"
),

"06-28" -> Vector(
"Leo"
),

"06-29" -> Vector(
"Pekka","Petri","Pekko","Pietari","Petra","Petteri"
),

"06-30" -> Vector(
"PÃ¤ivÃ¶","PÃ¤iviÃ¶"
),

"07-01" -> Vector(
"Aaro","Aaron"
),

"07-02" -> Vector(
"Meeri","Maaria","Maija","Maiju","Maikki","Mari","Kukka-Maaria","Marika","Maria"
),

"07-03" -> Vector(
"Arvo"
),

"07-04" -> Vector(
"Ulla","Ulpu"
),

"07-05" -> Vector(
"Untamo","Unto"
),

"07-06" -> Vector(
"Esa","Esaias"
),

"07-07" -> Vector(
"Klaus","Launo"
),

"07-08" -> Vector(
"Turkka","Turo"
),

"07-09" -> Vector(
"Ilta","Jade","Jasmin"
),

"07-10" -> Vector(
"Saima","Saimi"
),

"07-11" -> Vector(
"Eleonoora","Elli","Nelli","Noora"
),

"07-12" -> Vector(
"Herman","Hermanni","Herkko"
),

"07-13" -> Vector(
"Ilari","Joel","Lari"
),

"07-14" -> Vector(
"Aliisa"
),

"07-15" -> Vector(
"Rauna","Rauni"
),

"07-16" -> Vector(
"Reino"
),

"07-17" -> Vector(
"Ossi","Ossian"
),

"07-18" -> Vector(
"Riikka"
),

"07-19" -> Vector(
"Salla","Salli","Sara","Sari","Saara"
),

"07-20" -> Vector(
"Maarit","Maaret","Margareeta","Reeta","Marketta","Reetta"
),

"07-21" -> Vector(
"Jonna","Jenni","Jenna","Hanne","Hannele","Johanna","Hanna","Joanna"
),

"07-22" -> Vector(
"Leena","Leeni","Lenita","Matleena"
),

"07-23" -> Vector(
"Oili","Olga"
),

"07-24" -> Vector(
"Kiia","Kirsi","Tiina","Kirsti","Kristiina"
),

"07-25" -> Vector(
"Jaakko","Jaakob","Jaakoppi"
),

"07-26" -> Vector(
"Martta"
),

"07-27" -> Vector(
"Heidi"
),

"07-28" -> Vector(
"Atso"
),

"07-29" -> Vector(
"Olavi","Olli","Uolevi","Uoti"
),

"07-30" -> Vector(
"Asta"
),

"07-31" -> Vector(
"Elena","Helena"
),

"08-01" -> Vector(
"Maire"
),

"08-02" -> Vector(
"Kimmo"
),

"08-03" -> Vector(
"Linnea","Nea","Vanamo"
),

"08-04" -> Vector(
"Veera"
),

"08-05" -> Vector(
"Salme","Sanelma"
),

"08-06" -> Vector(
"Keimo","Toimi"
),

"08-07" -> Vector(
"Lahja"
),

"08-08" -> Vector(
"Silva","Sylvi","Sylvia"
),

"08-09" -> Vector(
"Eira","Erja"
),

"08-10" -> Vector(
"Lauri","Lasse","Lassi"
),

"08-11" -> Vector(
"Sanna","Sanni","Susanna","Susanne"
),

"08-12" -> Vector(
"Klaara"
),

"08-13" -> Vector(
"Jesse"
),

"08-14" -> Vector(
"Kanerva","Onerva"
),

"08-15" -> Vector(
"Marja","Jaana","Marjatta","Marjo","Marita","Marjut","Marianne","Maritta","Marjaana","Marjukka","Marianna","Jatta"
),

"08-16" -> Vector(
"Aulis"
),

"08-17" -> Vector(
"Verneri"
),

"08-18" -> Vector(
"Leevi"
),

"08-19" -> Vector(
"Mauno","Maunu"
),

"08-20" -> Vector(
"Sami","Samuli","Samu","Samuel"
),

"08-21" -> Vector(
"Soini","Veini"
),

"08-22" -> Vector(
"Iivari","Iivo"
),

"08-23" -> Vector(
"Signe","Varma"
),

"08-24" -> Vector(
"Perttu"
),

"08-25" -> Vector(
"Loviisa"
),

"08-26" -> Vector(
"Ilma","Ilmatar","Ilmi"
),

"08-27" -> Vector(
"Rauli"
),

"08-28" -> Vector(
"Tauno"
),

"08-29" -> Vector(
"Iina","Iinari","Iines"
),

"08-30" -> Vector(
"Eemeli","Eemil"
),

"08-31" -> Vector(
"Arvi"
),

"09-01" -> Vector(
"Pirkka"
),

"09-02" -> Vector(
"Sini","Sinikka"
),

"09-03" -> Vector(
"Soili","Soila","Soile"
),

"09-04" -> Vector(
"Ansa"
),

"09-05" -> Vector(
"Mainio","Roni"
),

"09-06" -> Vector(
"Asko"
),

"09-07" -> Vector(
"Miro","Arhippa","Arho"
),

"09-08" -> Vector(
"Taimi"
),

"09-09" -> Vector(
"Eevert","Isto"
),

"09-10" -> Vector(
"Kaleva","Kalevi"
),

"09-11" -> Vector(
"Ale","Aleksanteri","Ali","Aleksandra"
),

"09-12" -> Vector(
"Valma","Vilja"
),

"09-13" -> Vector(
"Orvo"
),

"09-14" -> Vector(
"Iida"
),

"09-15" -> Vector(
"Sirpa"
),

"09-16" -> Vector(
"Hilla","Hille","Hellevi","Hillevi"
),

"09-17" -> Vector(
"Aila","Aili"
),

"09-18" -> Vector(
"Tytti","Tyyne","Tyyni"
),

"09-19" -> Vector(
"Reija"
),

"09-20" -> Vector(
"Varpu","Vaula"
),

"09-21" -> Vector(
"Mervi"
),

"09-22" -> Vector(
"Mauri"
),

"09-23" -> Vector(
"Mielikki","Minja","Miisa"
),

"09-24" -> Vector(
"Alvar","Auno"
),

"09-25" -> Vector(
"Kullervo"
),

"09-26" -> Vector(
"Kuisma"
),

"09-27" -> Vector(
"Vesa"
),

"09-28" -> Vector(
"Arja"
),

"09-29" -> Vector(
"Miika","Mikaela","Mikael","Miikka","Miska","Mikko"
),

"09-30" -> Vector(
"Sirja","Sorja"
),

"10-01" -> Vector(
"Raino","Raine","Rainer","Rauno"
),

"10-02" -> Vector(
"Valio"
),

"10-03" -> Vector(
"Raimo"
),

"10-04" -> Vector(
"Saija","Saila"
),

"10-05" -> Vector(
"Inka","Inkeri"
),

"10-06" -> Vector(
"Minttu","Pinja"
),

"10-07" -> Vector(
"Birgitta","Pirita","Piritta","Pirjo","Pirkko"
),

"10-08" -> Vector(
"Hilja"
),

"10-09" -> Vector(
"Ilona"
),

"10-10" -> Vector(
"Aleksi","Aleksis"
),

"10-11" -> Vector(
"Ohto","Otso"
),

"10-12" -> Vector(
"Aarre","Aarto"
),

"10-13" -> Vector(
"Taija","Taina","Tanja"
),

"10-14" -> Vector(
"Elsa","Else","Elsi"
),

"10-15" -> Vector(
"Helvi","Heta"
),

"10-16" -> Vector(
"Sirkka","Sirkku"
),

"10-17" -> Vector(
"Saana","Saini"
),

"10-18" -> Vector(
"SÃ¤de","Satu"
),

"10-19" -> Vector(
"Uljas"
),

"10-20" -> Vector(
"Kasperi","Kauno"
),

"10-21" -> Vector(
"Ursula"
),

"10-22" -> Vector(
"Anniina","Anette","Anitta","Anita","Anja"
),

"10-23" -> Vector(
"Severi"
),

"10-24" -> Vector(
"Asmo","Rasmus"
),

"10-25" -> Vector(
"Sointu"
),

"10-26" -> Vector(
"Amanda","Manta","Niina"
),

"10-27" -> Vector(
"Hellin","HellÃ¤","Helli","Helle"
),

"10-28" -> Vector(
"Simo"
),

"10-29" -> Vector(
"Alfred","Urmas"
),

"10-30" -> Vector(
"Eila"
),

"10-31" -> Vector(
"Arto","Arttu","Artturi"
),

"11-01" -> Vector(
"Lyly","Pyry"
),

"11-02" -> Vector(
"Topi","Topias"
),

"11-03" -> Vector(
"Terho"
),

"11-04" -> Vector(
"Hertta"
),

"11-05" -> Vector(
"Reima"
),

"11-06" -> Vector(

),

"11-07" -> Vector(
"Taisto"
),

"11-08" -> Vector(
"Aatos"
),

"11-09" -> Vector(
"Teuvo"
),

"11-10" -> Vector(
"Martti"
),

"11-11" -> Vector(
"Panu"
),

"11-12" -> Vector(
"Virpi"
),

"11-13" -> Vector(
"Ano","Kristian"
),

"11-14" -> Vector(
"Iiris"
),

"11-15" -> Vector(
"Janette","Janita","Janika","Janina"
),

"11-16" -> Vector(
"Aarne","Aarni","Aarno"
),

"11-17" -> Vector(
"Einari","Eino"
),

"11-18" -> Vector(
"Jousia","Tenho"
),

"11-19" -> Vector(
"Eliisa","Elisa","Elise","Elisabet","Liisi","Liisa"
),

"11-20" -> Vector(
"Jalmari","Jari"
),

"11-21" -> Vector(
"Hilma"
),

"11-22" -> Vector(
"Selja","Silja"
),

"11-23" -> Vector(
"Ismo"
),

"11-24" -> Vector(
"Sivi","Lemmikki","Lempi"
),

"11-25" -> Vector(
"Katriina","Kaarina","Kaija","Kaisa","Katariina","Kati","Kaisu","Katja","Katri","Riina"
),

"11-26" -> Vector(
"Sisko"
),

"11-27" -> Vector(
"Hilkka"
),

"11-28" -> Vector(
"Heini","Kaisla"
),

"11-29" -> Vector(
"Aimo"
),

"11-30" -> Vector(
"Antero","Antti","Atte"
),

"12-01" -> Vector(
"Oskari"
),

"12-02" -> Vector(
"Anelma","Unelma"
),

"12-03" -> Vector(
"Meri","Vellamo"
),

"12-04" -> Vector(
"Aira","Airi"
),

"12-05" -> Vector(
"Selma"
),

"12-06" -> Vector(
"Niko","Nikolai","Niilo","Niklas"
),

"12-07" -> Vector(
"Sampsa"
),

"12-08" -> Vector(
"Kylli","Kyllikki"
),

"12-09" -> Vector(
"Anna","Anne","Anneli","Anni","Annika","Annikki","Annukka","Anu"
),

"12-10" -> Vector(
"Jutta"
),

"12-11" -> Vector(
"Daniel","Taneli","Tatu"
),

"12-12" -> Vector(
"Tuovi"
),

"12-13" -> Vector(
"Seija"
),

"12-14" -> Vector(
"Jouko"
),

"12-15" -> Vector(
"Heimo"
),

"12-16" -> Vector(
"Aada","Auli","Aulikki"
),

"12-17" -> Vector(
"Raakel"
),

"12-18" -> Vector(
"Aapo","Aappo","Rami"
),

"12-19" -> Vector(
"Iiro","Iikka","Isko","Iisakki"
),

"12-20" -> Vector(
"Benjamin","Kerkko"
),

"12-21" -> Vector(
"Tuomo","Tommi","Tomi","Tuomas"
),

"12-22" -> Vector(
"Raafael"
),

"12-23" -> Vector(
"Senni"
),

"12-24" -> Vector(
"Aatami","Eeva","Eevi","Eveliina"
),

"12-25" -> Vector(

),

"12-26" -> Vector(
"Tahvo","Tapani","Teppo"
),

"12-27" -> Vector(
"Hannes","Hannu"
),

"12-28" -> Vector(
"Piia"
),

"12-29" -> Vector(
"Rauha"
),

"12-30" -> Vector(
"Taavi","Daavid","Taavetti"
),

"12-31" -> Vector(
"Silvo","Sylvester"
)
)


    this.run()

    println("Started")
  }
}
