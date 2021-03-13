object SuggestService extends App {

  class SuggestService(companyNames: Seq[String]) {

    def suggest (input: String, numberOfSuggest: Int): Seq[String] = {
      val resss = companyNames.filter(_.startsWith(input)).filter(companyNames.indexOf(_) <= numberOfSuggest)
      resss
    }
  }

  val suggestserv = new SuggestService(Seq("Intel", "Microsoft", "Microwave", "Sun", "Silicon", "Apple", "AnalogDevices"))
  println(suggestserv.suggest("Micro", 10))
}
