object SuggestService extends App {

  class SuggestService(companyNames: Seq[String]) {

    def suggest (input: String, numberOfSuggest: Int): Seq[String] = {
      val res = companyNames.map(_.capitalize).filter(_.startsWith(input.capitalize)).filter(companyNames.indexOf(_) <= numberOfSuggest)
      res
    }
  }

  val suggestserv = new SuggestService(Seq("Intel", "microsoft", "Microwave", "Microflex", "Microcontroller", "Sun", "Silicon", "Apple", "AnalogDevices"))
  println(suggestserv.suggest("micro", 10))
}
