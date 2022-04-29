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
    
    
#### Selection Sort


    function selectionSort(arr) {
    
    for(let i =0; i< arr.length;i++){
        minIndex=i;
        
        for(let j =i+1; j<arr.length; j++){
        
            if(arr[j]< arr[minIndex]){
                minIndex=j
            }
        
        }
        
        if(arr[minIndex] !== i){
            const lesser = arr[minIndex]
            arr[minIndex] = arr[i]
            arr[i} = lesser;
        }
    }
    
    return arr;
    
    }
    
#### MergeSort

    
    function mergeSort(arr) {
    
        if(arr.length ===1){
            return arr;
        }
    
        const mid =  Math.floor(arr.length / 2)
        const left = arr.slice(0, mid)
        const right = arr.slice(mid)
    
        return merge(mergeSort(left), mergeSort(right));
    
    }


#### Merge 



    function merge(left, right) {
    
    const arr = [];
    
    while( left.length && right.length){
        
        if(left[0] < right[0]){
            arr.push(left.shift())
        }else{
            arr.push(right.shift())
        }
    }
    return [...arr, ...left, ...right]

}
    
    
    
    
