func isPerfectSquare(num int) bool {
    
    if(math.Trunc(math.Sqrt(float64(num)))==math.Sqrt(float64(num))){
        return true
    }else{
        return false
    }
}