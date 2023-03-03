package adapter;

public class GooglePlusAdapter extends GooglePlus implements SocialNetworks {

	@Override
	public void Share(String message) {
		System.out.println("GooglePlus: " + message);
	}
}
