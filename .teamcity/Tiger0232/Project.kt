package Tiger0232

import Tiger0232.buildTypes.*
import Tiger0232.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0232")
    name = "Tiger0232"

    vcsRoot(Tiger0232_cVCSroot)

    buildType(Tiger0232_Hi1)
    buildType(Tiger0232_Hi0)
    buildType(Tiger0232_Hi3)
    buildType(Tiger0232_Hi2)
})
