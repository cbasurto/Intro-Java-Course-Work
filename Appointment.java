//cbasurto: HW 1 problem 3 setting the appointment
public class Appointment
{
    //fields
    private Date date;
    private Time time;
    private String comment;

    //constructors
    public Appointment(){
	date = new Date(1,1,2015);
	time = new Time (10,15);
	comment = "Doctor Smith";
    }

    //standard constructor
    public Appointment (Date d, Time t, String c){
	date = d;
	time = t; 
	comment = c;
    }

    //toString to retrieve date information, time information, and comment
    // regarding appointment
    public String toString (){
	return "On "+date.toString()+" \n At "+time.toString()+"\n "+comment;
    }
}
