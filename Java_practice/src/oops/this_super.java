package oops;
class vehicle
{
	int speed=40;
}
class car extends vehicle
{
	int speed=100;
	void showspeed()
	{
		System.out.println("car normal speed="+speed);
		System.out.println(this.speed);
		System.out.println("vehicle normal speed="+super.speed);
	}
}
public class this_super {

	public static void main(String[] args) {
		car c=new car();
		c.showspeed();
		// TODO Auto-generated method stub

	}

}
