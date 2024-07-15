def solution(matrix):
    sum = 0
    
    
    #process for fisrt row is just to add it to sum because nothing is above it. (thats why we only do matrix[0] because we only need first row)
    for col in range(len(matrix[0])):
        sum += matrix[0][col]
        
    #Process for each row after
    for row in range(1, len(matrix)):
        for col in range(len(matrix[row])):
            if matrix[row][col] != 0: #If the cost of the current element isn't zero
                haunted_above = False #boolean to see if any rooms above it will be haunted.
                #If any room directly above (up to 2 rows) is haunted, it is not added to the sum
                for above_rows in range(row):
                    if matrix[above_rows][col] == 0:
                        haunted_above = True
                        break
                #if no rooms above it are haunted, it is added to the sum.
                if not haunted_above: 
                    sum += matrix[row][col]
                    
    return sum
                    
                
                

