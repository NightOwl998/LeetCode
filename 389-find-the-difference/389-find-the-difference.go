func findTheDifference(s string, t string) byte {
    var res byte
    for _,element := range t {
        if !(strings.Contains(s,string(element))){
            res=byte(element)
            
        }else{
        s=strings.Replace(s,string(element)," ",1)
        }
        
    }
    fmt.Println("string %s",s)
    return res
}