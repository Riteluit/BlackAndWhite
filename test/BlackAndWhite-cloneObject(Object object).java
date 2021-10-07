    public BlackAndWhite cloneObject(Object object)
    { BlackAndWhite obj = (BlackAndWhite) object;
      BlackAndWhite objClone;  
      String blackWhite[] = new String[7];
      
      String objBlackWhite[] = obj.getBlackWhite();
       
      objClone = new BlackAndWhite();
      objClone.setPos(obj.getPos());
      
      for (int i=0; i<7; i++)
           blackWhite[i] = objBlackWhite[i];
      
      objClone.setBlackWhite(blackWhite);
      return objClone;        
    } 
