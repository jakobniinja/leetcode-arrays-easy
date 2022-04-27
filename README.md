"# leetcode-arrays-easy" 

#### BST Validator




    function validate(node, min = null, max = null) {
    
    if(max!= null && node.data >max){
        return false;
    }
    
    else if(min!= null && node.data<min){
        return false;
    }
    
    else if (node.left  && !validate(node.left, min, node.data) ){
        return false;
    }
    else if (node.right && !validate(node.right, node.data, max)){
        return false;
    }
    return true;
    
    }
