
public class timeofday 
{
	private int min;
	private int hour;
	
	public String getTime()
	{
		String time = this.hour + ":" + this.min;
		return time;
	}
	public void setTime(int uur, int min)
	{
		if(uur > 23 || uur < 0)
		{
			System.out.println("Onmogelijk");
		}
		else if(min > 59 || min < 0)
		{
			System.out.println("Onmogelijk");
		}
		else
		{
			this.min = min;
			this.hour = uur;
			System.out.print(this.hour);
			System.out.print(":");
			System.out.print(this.min);
		}
	}
}
