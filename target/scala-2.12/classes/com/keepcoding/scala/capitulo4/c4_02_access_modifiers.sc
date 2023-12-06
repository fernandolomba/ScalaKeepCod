class Theater {
  private var freeSeats: Int = 100

  def getFreeSeats: Int = freeSeats

  protected def sellTickets(tickets: Int): Int = {
    if (freeSeats >= tickets) {
      freeSeats -= tickets
      tickets
    } else 0
  }
}

class TheaterOffice extends Theater {
  def sellTicketToPublic(tickets: Int): Int = {
    //...
    sellTickets(tickets)
    //...
  }
}

val theater = new Theater()
theater.getFreeSeats


val theaterOffice = new TheaterOffice


theaterOffice.getFreeSeats
theaterOffice.sellTicketToPublic(3)
theaterOffice.getFreeSeats
theaterOffice.sellTicketToPublic(3)
theaterOffice.getFreeSeats
