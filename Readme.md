## **ASSET MANAGEMENT APP-REST API** 

- This Repository has code for assets (like laptop, furnitures etc.)  management for a company to keep track of assets and ensuring their rightful optimal use.


## *Schema*
All API's are accessable over `HTTP`, and are accessable via  `<>`</br> 
All data is sent as JSON.

## *Tech Used*
- Spring Boot 2.6.9
- Spring Data JPA
- H2 In Memory Database
- Lombok Java Library(Imported Via Spring Boot Dev Tools)

## *Tables Created*

### ***Categories Table***<br>

| Category ID | Category Name | Description                                                       |
|-------------|---------------|-------------------------------------------------------------------|
| 1           | Laptop        | A battery powered compact personal computer with or without touch |
| 2           | Mobile        | A portable telephone receiver capable of radio calling            |
| 3           | Furniture     | Objects like Table, Chair, Sofa etc                               |                             	|

### ***Assets Table***<br>

| Asset ID | Asset Name       | Purchase Date | Asset Condition Notes | Asset Assigned Status |
|----------|------------------|---------------|-----------------------|-----------------------|
| 1        | Galaxy S10       | 2019-02-05    | Very Good Condition   | AVAILABLE             |
| 2        | ASUS VIVO Book   | 2021-10-15    | OK Condition          | ASSIGNED              |
| 3        | Fluid Lite Chair | 2020-02-18    | Poor Condition        | RECOVERED             |

### ***Assets AND Categories Table***<br>

| Asset ID | Category ID |
|----------|-------------|
| 1        | 2           |
| 2        | 1           |
| 3        | 3           |

### ***Assets AND Employees Table***<br>

| Asset ID | Employee ID |
|----------|-------------|
| 1        | 134686800   |
| 2        | 134685790   |
| 3        | 134685790   |

### ***Employees Table***<br>

| Employee ID | Name     | Designation      |
|-------------|----------|------------------|
| 134686800   | ADITYA   | Junior Developer |
| 134685790   | SANGARAK | Product Manager  |
| 134696424   | KRISHNA  | Senior Developer |
