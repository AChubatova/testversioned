package Tiger01542

import Tiger01542.buildTypes.*
import Tiger01542.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01542")
    name = "Tiger01542"

    vcsRoot(Tiger01542_cVCSroot)

    buildType(Tiger01542_Hi2)
    buildType(Tiger01542_Hi1)
    buildType(Tiger01542_Hi3)
    buildType(Tiger01542_Hi0)
})
