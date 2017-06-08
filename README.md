# Notes

## Web Workflow

```
Controller -> DB Dao
                |
                v
              Model -> View
```             

```
Chrome -> Tomcat -> Servlet (Controller) -> (--> DaoFactory ) -> Dao (Database) -> Beans (Models) -> view (jsp) -> Tomcat -> Chrome
```
