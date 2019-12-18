package Starter

class PropertyGetterSetterPerson{

    var age: Int = 0

    get(){
        return field
    }

    set(value){
        field = if(value >= 0) value else 0
    }
}