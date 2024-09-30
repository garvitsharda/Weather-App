# Configure the AWS Provider
provider "aws" {
    region = "ap-south-1"
} 


# Creating AWS EC2 Instance in AWS
resource "aws_instance" "ec2_example" {
    ami = "ami-007020fd9c84e18c7"  

    instance_type = "t2.micro" 
    tags = {
        Name = "CICD-pipelines"
    }
}