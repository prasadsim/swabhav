export class Customer{
    constructor (private _id ,private _name){}
      getId(){
           return this._id;
      }
      getName(){
          return this._name;
      }
      setName(name){
          this._name=name;
      }
      setId(id){
          this._id=id;
      }
   }
   export class Address{
       constructor(private _address){}
       getAddress(){
           return this._address;
       }
   
   }