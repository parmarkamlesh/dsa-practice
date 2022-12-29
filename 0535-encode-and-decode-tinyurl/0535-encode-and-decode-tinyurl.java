public class Codec {
// Encodes a URL to a shortened URL.
    
    HashMap<String,String>map=new HashMap<>();

    public String encode(String longUrl) {
        StringBuilder sb=new StringBuilder();
    
        sb.append((char)(Math.floor(Math.random()*100)));
        while(map.containsKey(sb.toString())){
            sb.append((char)Math.floor(Math.random()*100));
        }
        
        map.put(sb.toString(),longUrl);
        return sb.toString();        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
            return map.get(shortUrl);
    
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));