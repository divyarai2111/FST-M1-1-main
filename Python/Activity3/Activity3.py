user1=input("User 1 choose- rock,paper,scissor").lower()
user2=input("User 2 choose- rock,paper,scissor").lower()

if user1==user2:
    print("Its a tie")
elif user1=='rock':
    if user2=='paper':
        print("User 2 Paper wins")
    else:
        print("User 1 Rock wins")
elif user1=='paper':
    if user2=='rock':
        print("User 1 Paper wins")
    else:
        print("User 2 Scissor wins")  
elif user1=='scissor':
    if user2=='rock':
        print("User 2 Rock wins")
    else:
        print("User 1 Scissor wins")
else:
    print("Invalid")