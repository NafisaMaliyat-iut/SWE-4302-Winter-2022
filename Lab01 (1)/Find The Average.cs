using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01__1_
{
    internal class FindTheAverage
    {
        public int CalculatingAvergae(string Input)
        {
            var numbers = Input
            .Split(',')
            .Where(x => int.TryParse(x, out _))
            .Select(int.Parse)
            .ToList();

            int sum = 0;
            foreach (var number in numbers)
            { sum+=number; Console.WriteLine(number); }

            return 1;
            //return sum/numbers.Count;
        }
    }
}

