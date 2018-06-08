package myNamesRaph.test.util;

public class Reference {

	public static final String MOD_ID = "cheeseplusplus";
	public static final String NAME = "Cheese ++";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSION = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "myNamesRaph.test.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "myNamesRaph.test.proxy.ServerProxy";
	
	public static enum TestItems {
		CHEESE("cheese", "itemcheese");
		
		private String unlocalizedName;
		private String registryName;
		
		TestItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
