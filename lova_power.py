class lova_Power:
    def __init__(self, battery,charging_connector,LED_indicator):
        self.battery = battery
        self.charging_connector = charging_connector
        self.LED_indicator = LED_indicator

        
    def charging_on(x):
        print('The battery in lova robot starts charging from power source')

    def battery_full(x):
        print('The battery stops charging from source when battery full')
    
    def low_battery(x):
        print('The led_indicator blinks to show battery is less than 10%')
