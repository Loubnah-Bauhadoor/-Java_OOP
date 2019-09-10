/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Item {
	
	//static attributes
	private static int counter = 0;
	/***************************/
	
	/* object attributes*/
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private String supplierContacts;
	private double price;
	private int quantity;
	
	/*Constructor*/
	
	/**
	 *  Default constructors 
	 */
	
	public Item() {
		
		this.itemId = null;
		this.name = null;
		this.description = null;
		this.category = null;
		this.supplierName = null;
		this.supplierContacts = null;
		this.price = 0.0;
		this.quantity = 0;
		
		setCounter((getCounter()+1));
	}
	
	
	public Item(String itemId, String name) {
		
		this.itemId = itemId;
		this.name = name;
		this.description = null;
		this.category = null;
		this.supplierName = null;
		this.supplierContacts = null;
		this.price = 0.0;
		this.quantity = 0;
		
		setCounter((getCounter()+1));
		
	}
	
	/**
	 * 
	 * @param itemId
	 * @param name
	 * @param description
	 * @param category
	 * @param supplierName
	 * @param supplierContacts
	 * @param price
	 * @param quantity
	 */
		
		public Item(String itemId, String name, String description, String category, String supplierName, String supplierContacts, double price, int quantity) {
			this.itemId = itemId;
			this.name = name;
			this.description = description;
			this.category = category;
			this.supplierName = supplierName;
			this.supplierContacts = supplierContacts;
			this.price = price;
			this.quantity = quantity;
			
			setCounter((getCounter()+1));
		}
		
		/***Getters***/
		
		/**
		 * Method to return itemId
		 * @return gets Id of item
		 */

		public String getItemId() {
			return this.itemId;
		}

		

		public String getName() {
			return this.name;
		}

		

		public String getDescription() {
			return this.description;
		}

		

		public String getCategory() {
			return this.category;
		}

		

		public String getSupplierName() {
			return this.supplierName;
		}

		

		public String getSupplierContacts() {
			return this.supplierContacts;
		}

		

		public double getPrice() {
			return this.price;
		}

		

		public int getQuantity() {
			return this.quantity;
		}

		
		
		/**Setters**/
		
		/**
		 * Method to set ItemId 
		 * @param itemId
		 */
		
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public void setCategory(String category) {
			this.category = category;
		}
		
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		
		public void setSupplierContacts(String supplierContacts) {
			this.supplierContacts = supplierContacts;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
		
		@Override
		public String toString() {
			return "Item [itemId=" + itemId + ", name=" + name + ", description=" +description + ", category=" + category
					+ ", supplierName=" + supplierName + ", supplierContacts=" + supplierContacts + ", price=" + price
					+ ", quantity=" + quantity + "]";
		}
		
		
		
		
		
		public boolean equals(Item item1) {
			
			if(this.itemId.equalsIgnoreCase(item1.itemId)) {
				return true;
				
			}
			else {
				return false;
			}
		}
		
		/**
		 * 
		 * @return the counter 
		 */
		
		public static int getCounter() {
			return counter;
		}	
		
		/**
		 * 
		 * @param counter the counter to set
		 */
		
		public static void setCounter(int counter) {
			Item.counter = counter;
		}
}

