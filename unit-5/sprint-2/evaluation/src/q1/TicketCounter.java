package q1;

//*********************************************

public class TicketCounter {
		
	int availableSeats=3;
	
	public void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException{
		
		if(numberOfSeats<=availableSeats) {
			availableSeats=availableSeats-numberOfSeats;
			System.out.println();
			System.out.println("tickes booked : "+numberOfSeats+", by "+name);
			
			System.out.println();
		}
		else {
			NoSeatAvailableException nsae=new NoSeatAvailableException("No tickets left for "+name);
			throw nsae;
		}
		
	}
	
	
}

//*********************************************


class NoSeatAvailableException extends Exception{
	
	public NoSeatAvailableException(String message) {
		super(message);
	}
	
}

//*********************************************

class TicketBooking extends Thread{
	
	TicketCounter ticketCounter;
	String passengerName;
	int noOfSeatsToBook;
	
	
	
	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}



	@Override
	public synchronized void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			System.out.println("No tickets left for "+passengerName);
			e1.printStackTrace();
		}
		
		try {
			
			ticketCounter.bookSeat(passengerName, noOfSeatsToBook);
		} catch (NoSeatAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


//*********************************************

class main{
	
	public static void main(String[] args) throws InterruptedException {
		TicketCounter ticketCounter =new TicketCounter();
		
		TicketBooking ticketBooking1=new TicketBooking(ticketCounter, "nameA", 2);
		TicketBooking ticketBooking2=new TicketBooking(ticketCounter, "nameB", 1);
		TicketBooking ticketBooking3=new TicketBooking(ticketCounter, "nameC", 1);
		
		ticketBooking1.start();
		ticketBooking1.join();
		ticketBooking2.start();
		ticketBooking2.join();
		ticketBooking3.start();
		
	}
	

	
	
	
	
}


//*********************************************

