class gameLancher{
public static void main(String args[])
{ game starter= new game();
starter.intialize();
starter.address_setter();
starter.checking();
starter.score();

}

}

Class game{
	 private ArrayList<ships>  listing_Ships= new ArrayList<ships>;
	helper addressor = new helper();
	private int tries=0;
	 public void intialize()
	 {
		 ships one= new ships();
		  ships two= new ships();
		   ships three= new ships();
		 one.SetName="Titanic";
		 two.SetName="Black Pearl";
 three.SetName="water monster";	

 listing_Ships.add(one);
 listing_Ships.add(two);
 listing_Ships.add(three);
 
	 }
	
	public void address_setter()
	{
		for(ships shipInstance:listing_Ships)
		{shipinstance.setAddress(addressor.getAddress());
			
		}
	}
	public void guesser()
	{
		while(!listing_Ships.Isempty())
			tries++;
		{String user_guess = addressor.getUserInput();
		for(ships shipInstance:listing_Ships)
		{String result=shipinstance.checkInput(user_guess);
			if(result=="hit")
				break;
				if(result=="kill")
				{listing_Ships.remove(shipInstance);
					break;
			    }
		}
		System.out.println("you"+result+"it");
	    }
	}
	
	public void score()
	{ int score=5000-50*tries;
		System.out.println(score);
		
	}
	
	
}

class Ships
{
	
	
	
	
	
	
	
	
	
	
	
}