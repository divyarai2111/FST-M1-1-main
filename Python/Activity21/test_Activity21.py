#Create a new test file and write test to validate the following cases:

# Sum of two numbers
# Difference of two numbers
# Product of two numbers
# Quotient of two numbers

import pytest
def test_add():
    sum=10+20
    assert sum==30
    # assert sum==0

def test_sub():
    sub=20-5
    assert sub==15
    # assert sub==0

def test_prod():
    prod=10*20
    assert prod==200
    # assert prod==0

def test_quo():
    quo=32/5
    assert quo==6
    # assert quo==0
