class lova_control_2:
    def __init__(self, Vending_machine_id,Quantity,Item_details, Unfulfilled_item_list, fulfilled_item_list, order_id):
        self.Vending_machine_id = Vending_machine_id
        self.Quantity = Quantity
        self.Item_details = Item_details
        self.Unfulfilled_item_list = Unfulfilled_item_list
        self.fulfilled_item_list = fulfilled_item_list
        self.order_id = order_id
        
    def select(x):
        print('The robot selects the item from the vending machine')
        # selects the items from vending machines in the warehouse to collect

    def collect(x):
        print('The robot collects the item\(s)\ from the vending machine into the container')
        #collects the items from vending machine specified by the lova_control_1 into the container
    
    def fetch_orderdetails(x):
        print('The Control unit 2 fetches the order details from cloud')
        # order details are fetched from cloud/ Internet into control unit 2
        
    def update_unfulfilled(x):
        print('The control unit updates the unfulfilled item list')
    
    def update_fulfilled(x):
        print("The control unit updates the unfulfilled item list")
