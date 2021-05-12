package Tiger0732

import Tiger0732.buildTypes.*
import Tiger0732.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0732")
    name = "Tiger0732"

    vcsRoot(Tiger0732_cVCSroot)

    buildType(Tiger0732_Hi0)
    buildType(Tiger0732_Hi2)
    buildType(Tiger0732_Hi1)
    buildType(Tiger0732_Hi3)
})
