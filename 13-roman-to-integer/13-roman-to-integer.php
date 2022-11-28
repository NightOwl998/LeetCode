
<?php
    Class Solution{

      function romanToInt($s){    
       $dic = [
    'I' => 1,
    'V' => 5,
    'X' => 10,
    'L'=> 50,
    'C' => 100,
    'D' => 500,
    'M' => 1000,          
];       

         
             if ( 0<strlen($s)  and strlen($s)<16 and ((strpos($s, 'I')!==false) or (strpos($s, 'V') !==false) or (strpos($s, 'X') !==false) or (strpos($s, 'L') !==false) or (strpos($s, 'C') !==false) or (strpos($s, 'D') !==false) or (strpos($s, 'M')!==false))){
                $number=0;
                for ($i=0;$i<strlen($s);$i++)
                {
                    
                    if ($i != strlen($s)-1)
                    {  
                       
                        if( $dic[$s[$i]]>=$dic[$s[$i+1]])
                        {
                            $number=$number+$dic[$s[$i]];
                            
                        }else{
                            $number=$number+$dic[$s[$i+1]]-$dic[$s[$i]];
                            
                            $i=$i+1;                           

                        }
                        
                    }else
                    {
                        $number=$number+$dic[$s[$i]];
 
                    }
                    
                }
             }
             return $number;
        }

       
    

}



?>