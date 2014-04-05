package org.donkeyenough


class Feedback {
  String title
    String feedback
  Date dateCreated // Predefined names by Grails will be filled automatically
  Date lastUpdated // Predefined names by Grails will be filled automatically

  // Contrains are defined as static 
    static constraints = {
      title(blank:false, nullable: false, size:3..80)
      feedback(blank:false, nullable:false,size:3..500)
    }

} 