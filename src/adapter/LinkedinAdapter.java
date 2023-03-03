package adapter;

public class LinkedinAdapter extends Linkedin implements SocialNetworks {

	@Override
	public void Share(String message) {
		System.out.println("Linkedin: " + message);
	}
}