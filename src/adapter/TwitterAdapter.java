package adapter;

public class TwitterAdapter extends Twitter implements SocialNetworks{

	@Override
	public void Share(String message) {
		System.out.println("Twitter: " + message);	
	}
}