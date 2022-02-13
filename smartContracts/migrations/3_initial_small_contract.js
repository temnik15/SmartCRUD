const smallcontract = artifacts.require("smallcontract");

module.exports = function (deployer) {
    deployer.deploy(smallcontract);
};
