#Using pytest:

# Apply the marker 'activity' to the last 2 test methods.
# Run tests based on substring
# Run tests based using the 'activity' marker.

import pytest
def test_add():
    sum=10+20
    assert sum==30
    # assert sum==0

def test_sub():
    sub=20-5
    assert sub==15
    # assert sub==0

@pytest.mark.activity
def test_prod():
    prod=10*20
    assert prod==200
    # assert prod==0

	
@pytest.mark.activity
def test_quo():
    quo=32/5
    assert quo==6
    # assert quo==0
