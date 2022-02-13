// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract testContract {
    address owner;
    mapping(address => bool) contracts; // storage of contract addresses
    bool[] statusContracts;

    constructor() public {
        owner = msg.sender;
    }

    function register(address _address) public {
        require(msg.sender == owner, "Not owner");
        contracts[_address] = true;
        statusContracts.push(false);
        contracts
    }

    function doneSubContract() {

    }
}
