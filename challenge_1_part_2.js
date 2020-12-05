let multipliedExpensesValue = 0;
for(let i=0;i<expenses.length;i++)
{
    for(let j=i+1;j<expenses.length;j++)
    {
        for(let z=j+1;z<expenses.length;z++)
        {
            if(expenses[i]+expenses[j]+expenses[z]==2020)
            {
                multipliedExpensesValue = expenses[i]*expenses[j]*expenses[z];
            }
        }
    }
}
