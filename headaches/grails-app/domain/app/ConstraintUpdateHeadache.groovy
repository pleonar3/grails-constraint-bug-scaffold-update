package app

// demonstrates the problem with constraints on the udpate CRUD
// try creating two objects, then update one to have the same value for the property 'shouldBeUnique'
// it will not persist, but will fail silently :/
class ConstraintUpdateHeadache {
    String shouldBeUnique

    static constraints = {
        shouldBeUnique unique: true
    }
}
