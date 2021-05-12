package Tiger0526

import Tiger0526.buildTypes.*
import Tiger0526.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0526")
    name = "Tiger0526"

    vcsRoot(Tiger0526_cVCSroot)

    buildType(Tiger0526_Hi0)
    buildType(Tiger0526_Hi1)
    buildType(Tiger0526_Hi2)
    buildType(Tiger0526_Hi3)
})
