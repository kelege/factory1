package kfc;

public class KFCwaiter {
private MealBuilder mb;
	
	public KFCwaiter(MealBuilder mb)
	{
		this.mb=mb;
	}
	
	public void setBuilder(MealBuilder mb)
	{
		this.mb=mb;
	}
	
	public Meal construct()
	{
		mb.buildFood();
		mb.buildDrink();
		return mb.getMeal();
	}

}
