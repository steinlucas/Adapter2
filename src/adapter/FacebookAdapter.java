package adapter;

public class FacebookAdapter extends Facebook implements SocialNetworks {

	@Override
	public void Share(String message) {
		System.out.println("Facebook: " + message);
		// TODO Auto-generated method stub
	}

}
