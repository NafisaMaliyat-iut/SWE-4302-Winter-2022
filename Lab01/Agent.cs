using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01
{
    internal class Agent
    {
        public List<Bus_Booking> BusBookings = new List<Bus_Booking>();
        public List<Air_Booking> AirBookings = new List<Air_Booking>();

        //1 for bus and 2 for air booking
        //return 0 for successful and -1 for unsuccessful
        public int MakeABooking()
        {
            int BookingType;
            
            Console.WriteLine("Enter 1 for bus booking or 2 for air booking.\n");
            BookingType = Convert.ToInt32(Console.ReadLine());

            if(BookingType ==1)
            {
                Bus_Booking dummyBusBooking = new Bus_Booking();
                dummyBusBooking.BookTicket();
                BusBookings.Add(dummyBusBooking);
                return 1;
            }
            else if(BookingType == 2)
            {
                Air_Booking dummyAirBooking = new Air_Booking();
                dummyAirBooking.BookTicket();
                AirBookings.Add(dummyAirBooking);
                return 2;
            }
            else
            {
                Console.WriteLine("Enter a valid booking type!\n");
                return -1;
            } 
                
        }

        
    }
}
