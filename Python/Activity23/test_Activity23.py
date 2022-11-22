#Create a fixture that initializes a list containing numbers from 0-10.
import pytest
 
@pytest.fixture
def num_list():
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list


# Write a test method asserting that the sum of that list is 55
def test_sum(num_list):
    sum = 0
    for n in num_list:
        sum += n
    assert sum == 56


# Once you confirm that the test passes, move the fixture into the conftest.py file and rerun the test.