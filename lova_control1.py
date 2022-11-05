class lova_control_1:
    def __init__(self, current_location,Destination,max_speed,warehouse_map, Order_id, Item_details, Image_processing_unit, Scan_IRS):
        self.current_location = current_location
        self.Destination = Destination
        self.max_speed = max_speed
        self.warehouse_map = warehouse_map
        self.Order_id = Order_id
        self.Item_details = Item_details
        self.Image_processing_unit = Image_processing_unit
        self.Scan_IRS = Scan_IRS
        
    def Move_forward(x):
        print('The Lova robot starts moving forward')

    def Move_backward(x):
        print('The Lova robot starts moving Backward')
        
    def Turn_left(x):
        print('The Lova robot Turns left')

    def Turn_right(x):
        print('The Lova robot Turns right')
        
    def Halt_sudden(x):
        print('The Lova robot stops suddenly, when it receives an signal from IRS1 or IRS2')

    def Halt_smooth(x):
        print('The Lova robot Stops Smoothly, when it reaches destination')
        
    def Capture(x):
        print('The Lova robot captures from camera 1 or 2')

    def Create_route(x):
        print('The Lova robot creates shortest path to current loaction and destination')
